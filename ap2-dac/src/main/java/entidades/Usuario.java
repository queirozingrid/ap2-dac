package entidades;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.GeneratedValue;


@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String login;
	private String nome;
	private String senha;
	@Temporal(TemporalType.DATE)
	@Column(name = "data_de_cadastro")
	private Date dataCadastro;
	
	// Método Getter - Id:
	public Integer getId() {
		return this.id;
	}
	
	// Métodos Getters e Setters - Nome:
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	// Métodos Getters e Setters - Data de Cadastro:
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	// Métodos Getters e Setters - Login:
	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	// Métodos Getters e Setters - Senha:
	public String getSenha() {
		return this.senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	// Método toString():
	@Override
	public String toString() {
		return "Usuario [Login=" + login + ", Senha=" + senha + "]";
	}
	
}