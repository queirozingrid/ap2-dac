package bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LoginBean {
	public String logar() {
		return "listagem_incidente.xhtml?faces-redirect=true";
	}
}
