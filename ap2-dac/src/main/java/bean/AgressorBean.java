package bean;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import static util.MessageUtil.*;

import entidades.Agressor;
import entidades.Vitima;
import dao.AgressorDao;
import dao.VitimaDao;

public class AgressorBean {
	private Agressor agressor = new Agressor();
	private List<Agressor> lista;
	
	public String salvar() {
		try {
			AgressorDao.salvar(agressor);
			sucesso("Sucesso", "Sucesso ao realizar salvamento");
			agressor = new Agressor();
		} catch (Exception e) {
			erro("Erro", "Erro ao realizar salvamento!");
		}
		return null;
	}
	
	public String editar() {
		try {
			AgressorDao.editar(agressor);
			sucesso("Sucesso", "Sucesso ao realizar salvamento");
			return "";
		} catch (Exception e) {
			erro("Erro", "Erro ao realizar salvamento!");
		}
		return null;
	}
	
	public String excluir() {
		try {
			AgressorDao.excluir(agressor);
			sucesso("Sucesso", "Sucesso ao excluir registro");
			return "";
		} catch (Exception e) {
			erro("Erro", "Erro ao realizar salvamento!");
		}
		return null;
	}
	
	public List<Agressor> getLista() {
		if (lista == null) {
			lista = AgressorDao.listar(agressor);
		}
		return lista;
	}
	
	public void setLista(List<Agressor> l) {
		this.lista = l;
	}

	public Agressor getAgressor() {
		return agressor;
	}

	public void setAgressor(Agressor agressor) {
		this.agressor = agressor;
	}
	
	
}