package bean;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


import dao.DenunciaDao;

import entidades.Denuncia;
import static util.MessageUtil.*;

import java.util.List;

@ManagedBean
public class DenunciaBean {
	private Denuncia denuncia = new Denuncia();
	private List<Denuncia> lista;
	
	public String salvar() {
		try {
			DenunciaDao.salvar(denuncia);
			sucesso("Sucesso!", "Denúncia criada com sucesso!");
			denuncia = new Denuncia();
		} catch (Exception e) {
			erro("Erro", "Não foi possível criar o usuário. ");
		} return "";
	}
	
	public String editar() {
		try {
			DenunciaDao.editar(denuncia);
			sucesso("Sucesso", "Denúncia alterada com sucesso!");
			return "";
		} catch (Exception e) {
			erro("Erro", "Não foi possível realizar a alteração.");
		} return null;
	}
	
	// public String login() {}
	
	public String excluir() {
		try {
			DenunciaDao.excluir(denuncia);
			sucesso("Sucesso", "Denúncia excluída com sucesso!");
			return "";
		} catch (Exception e) {
			erro("Erro", "Não foi possível excluir a denúncia.");
		} return null;
	}
	
	public List<Denuncia> getLista() {
		if (lista == null) {
			lista = DenunciaDao.listar();
		}
		return lista;
	}
	
	public void setLista(List<Denuncia> l) {
		this.lista = l;
	}
	
	public Denuncia getDenuncia() {
		return denuncia;
	}
	
	public void setDenuncia(Denuncia denuncia) {
		this.denuncia = denuncia;
	}
	
}