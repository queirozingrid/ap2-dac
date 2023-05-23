package entidades;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Incidente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "vitima_id")
	private Vitima vitima;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "agressor_id")
	private Agressor agressor;
	
	@Column(name = "descricao_do_incidente")
	private String descricaoIncidente;
	
	@ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "direitos_violados", joinColumns = @JoinColumn(name = "incidente_id"))
	private List<String> direitosViolados;
	
	@Column(name = "data_registro_incidente")
	@Temporal(TemporalType.DATE)
	private Date dataRegistro;

	private String providenciasTomadas;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Vitima getVitima() {
		return vitima;
	}

	public void setVitima(Vitima vitima) {
		this.vitima = vitima;
	}

	public Agressor getAgressor() {
		return agressor;
	}

	public void setAgressor(Agressor agressor) {
		this.agressor = agressor;
	}

	public String getDescricaoIncidente() {
		return descricaoIncidente;
	}

	public void setDescricaoIncidente(String descricaoIncidente) {
		this.descricaoIncidente = descricaoIncidente;
	}

	public List<String> getDireitosViolados() {
		return direitosViolados;
	}

	public void setDireitosViolados(List<String> direitosViolados) {
		this.direitosViolados = direitosViolados;
	}

	public Date getDataRegistro() {
		return dataRegistro;
	}

	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}

	public String getProvidenciasTomadas() {
		return providenciasTomadas;
	}

	public void setProvidenciasTomadas(String providenciasTomadas) {
		this.providenciasTomadas = providenciasTomadas;
	}

}
