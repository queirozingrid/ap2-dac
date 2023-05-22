package bean;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;


import dao.UsuarioDao;

import entidades.Usuario;
import static util.MessageUtil.*;

import java.util.List;

@ManagedBean
@RequestScoped 
public class UsuarioBean {
	private Usuario usuario = new Usuario();
	private List<Usuario> lista;
	
	public String salvar() {
		try {
			UsuarioDao.salvar(usuario);
			sucesso("Sucesso!", "Usuario criado com sucesso!");
			usuario = new Usuario();
		} catch (Exception e) {
			erro("Erro", "Não foi possível criar o usuário. ");
		} return "";
	}
	
	public String editar() {
		try {
			UsuarioDao.editar(usuario);
			sucesso("Sucesso", "Usuário alterado com sucesso!");
			return "";
		} catch (Exception e) {
			erro("Erro", "Não foi possível realizar a alteração.");
		} return null;
	}
	
	// public String login() {}
	
	public String excluir() {
		try {
			UsuarioDao.excluir(usuario);
			sucesso("Sucesso", "Usuário excluído com sucesso!");
			return "";
		} catch (Exception e) {
			erro("Erro", "Não foi possível excluir o usuário.");
		} return null;
	}
	
	public List<Usuario> getLista() {
		if (lista == null) {
			lista = UsuarioDao.listar(usuario);
		}
		return lista;
	}
	
	public void setLista(List<Usuario> l) {
		this.lista = l;
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}