package entidades;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Vitima {
	
	@Id
	@GeneratedValue
	private Integer id;

	@Column(name = "nome_identificado")
	private String nome;
	
	private String sexo;
	private Integer idade;
	private Integer serie;
	private String turno;
	private String endereco;

	@OneToMany(mappedBy = "vitima")
	private List<Incidente> incidentes;
	
	public void setId(Integer id) {
		this.id = id;
	}
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
	public Integer getSerie() {
		return serie;
	}
	public void setSerie(Integer serie) {
		this.serie = serie;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public List<Incidente> getIncidentes() {
		return incidentes;
	}
	public void setIncidentes(List<Incidente> incidentes) {
		this.incidentes = incidentes;
	}

	@Override
	public String toString() {
		return "Vitima [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", serie=" + serie + ", turno=" + turno
				+ ", endereco=" + endereco + "]";
	}
	
	
}
