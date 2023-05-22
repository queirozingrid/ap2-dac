package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

@Entity
@Table(name = "suposto_agressor")
public class Agressor {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String nome;
	private String sexo;
	private Integer idade;
	@Column(name = "relacionamento_com_vitima")
	private String relacionamentoVitima;
	private String ocupacao;
	private String raca;
	@Column(name = "identidade_de_genero")
	private String identidadeGenero;
	private String escolaridade;
	
	public Integer getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getRelacionamentoVitima() {
		return relacionamentoVitima;
	}
	public void setRelacionamentoVitima(String relacionamentoVitima) {
		this.relacionamentoVitima = relacionamentoVitima;
	}
	public String getOcupacao() {
		return ocupacao;
	}
	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public String getIdentidadeGenero() {
		return identidadeGenero;
	}
	public void setIdentidadeGenero(String identidadeGenero) {
		this.identidadeGenero = identidadeGenero;
	}
	public String getEscolaridade() {
		return escolaridade;
	}
	public void setEscolaridade(String escolaridade) {
		this.escolaridade = escolaridade;
	}
	
	@Override
	public String toString() {
		return "Agressor [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", relacionamentoVitima="
				+ relacionamentoVitima + ", ocupacao=" + ocupacao + ", raca=" + raca + ", identidadeGenero="
				+ identidadeGenero + ", escolaridade=" + escolaridade + "]";
	}
	
	
	
}