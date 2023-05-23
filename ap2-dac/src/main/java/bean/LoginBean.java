package bean;

import javax.faces.bean.ManagedBean;

import dao.UsuarioDao;
import entidades.Usuario;
import static util.MessageUtil.erro;

@ManagedBean
public class LoginBean {
	private Usuario usuario = new Usuario();

	public String logar() {
		Boolean usuarioEncontrado = verificarCadastro(usuario.getLogin(), usuario.getSenha());
		
		if (usuarioEncontrado) {
			return "listagem_incidente.xhtml?faces-redirect=true";
		} else {
			erro("Erro", "Usuario não encontrado na base de dados. Faça seu cadastro!");
			return null;
		}
	}
	public Boolean verificarCadastro(String login, String senha) {
		Boolean usuarioEncontrado = UsuarioDao.encontraPorLoginESenha(login, senha);
		return usuarioEncontrado;
		
	}
}