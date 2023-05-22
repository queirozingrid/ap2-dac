package entidades;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Incidente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "vitima_do_incidente")
	private Vitima vitima;
	
	@Column(name = "agressor_do_incidente")
	private Agressor supostoAgressor;
	
	@Column(name = "descricao_do_incidente")
	private String descricaoIncidente;
	
	@Column(name = "direitos_violados")
	private ArrayList<String> direitosViolados;

	public Vitima getVitima() {
		return vitima;
	}

	public void setVitima(Vitima vitima) {
		this.vitima = vitima;
	}

	public Agressor getSupostoAgressor() {
		return supostoAgressor;
	}

	public void setSupostoAgressor(Agressor supostoAgressor) {
		this.supostoAgressor = supostoAgressor;
	}

	public String getDescricaoIncidente() {
		return descricaoIncidente;
	}

	public void setDescricaoIncidente(String descricaoIncidente) {
		this.descricaoIncidente = descricaoIncidente;
	}

	public ArrayList<String> getDireitosViolados() {
		return direitosViolados;
	}

	public void setDireitosViolados(ArrayList<String> direitosViolados) {
		this.direitosViolados = direitosViolados;
	}

}
