package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;

@Entity
@Table(name = "denuncia")
public class Denuncia {
	
	@Id
	@GeneratedValue
	private Integer id;
	private String incidente;
	@Column(name = "violacao_de_direito")
	private String violacaoDireito;
	@Column(name = "providencias_tomadas")
	private String providencias;
	
	public Integer getId() {
		return id;
	}
	public String getIncidente() {
		return incidente;
	}
	public void setIncidente(String incidente) {
		this.incidente = incidente;
	}
	public String getViolacaoDireito() {
		return violacaoDireito;
	}
	public void setViolacaoDireito(String violacaoDireito) {
		this.violacaoDireito = violacaoDireito;
	}
	
	public String getProvidencias() {
		return this.providencias;
	}
	
	public void setProvidencias(String providencia) {
		this.providencias = providencia;
	}
	@Override
	public String toString() {
		return "Denuncia [incidente=" + incidente + ", violacaoDireito=" + violacaoDireito + "]";
	}
	
}