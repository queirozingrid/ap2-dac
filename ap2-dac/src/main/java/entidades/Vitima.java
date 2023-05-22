package entidades;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

@Entity
@Table(name = "vitima")
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
	
	@Override
	public String toString() {
		return "Vitima [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + ", serie=" + serie + ", turno=" + turno
				+ ", endereco=" + endereco + "]";
	}
	
	
}
