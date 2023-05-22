package bean;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import static util.MessageUtil.*;

import entidades.Denuncia;
import entidades.Vitima;
import dao.DenunciaDao;
import dao.VitimaDao;

public class VitimaBean {
	private Vitima vitima = new Vitima();
	private List<Vitima> lista;
	
	public String salvar() {
		try {
			VitimaDao.salvar(vitima);
			sucesso("Sucesso", "Sucesso ao realizar salvamento");
			vitima = new Vitima();
		} catch (Exception e) {
			erro("Erro", "Erro ao realizar salvamento!");
		}
		return null;
	}
	
	public String editar() {
		try {
			VitimaDao.editar(vitima);
			sucesso("Sucesso", "Sucesso ao realizar edição");
			return "";
		} catch (Exception e) {
			erro("Erro", "Erro ao realizar salvamento!");
		}
		return null;
	}
	
	public String excluir() {
		try {
			VitimaDao.editar(vitima);
			sucesso("Sucesso", "Sucesso ao excluir registro");
			return "";
		} catch (Exception e) {
			erro("Erro", "Erro ao realizar salvamento!");
		}
		return null;
	}
	
	public List<Vitima> getLista() {
	
		if (lista == null) {
			lista = VitimaDao.listar(vitima);
		}
		return lista;

	}
	
	public void setLista(List<Vitima> l) {
		this.lista = l;
	}

	public Vitima getVitima() {
		return vitima;
	}

	public void setVitima(Vitima vitima) {
		this.vitima = vitima;
	}
	
	
	
}