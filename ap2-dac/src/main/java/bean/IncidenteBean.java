package bean;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.IncidenteDao;
import entidades.Agressor;
import entidades.Incidente;
import entidades.Vitima;

@ManagedBean
@ViewScoped
public class IncidenteBean {
	private Vitima vitima = new Vitima();
	private Agressor supostoAgressor = new Agressor();
	private Incidente incidente = new Incidente();

	private ArrayList<String> direitosVioladosSelecionadosPelaVitima;
	private List<String> possiveisDireitosViolados;
	
	private List<Incidente> incidentes;
	
	/////////////////////////////////////////
	//			- MÉTODOS -	   			  //
	///////////////////////////////////////
	
	// Construtor
	public IncidenteBean() {
		possiveisDireitosViolados = Arrays.asList(
				"Violência Física",
				"Automutilação",
				"Bullying",
				"Negligência",
				"Suicídio",
				"Violência Sexual",
				"Gravidez em menor de 14 anos",
				"Violência psicológica",
				"Trabalho Infantil"
				);
	}
	
	// Salvar
	public void salvar() {
		try {
			incidente.setVitima(vitima);
			incidente.setAgressor(supostoAgressor);
			incidente.setDireitosViolados(direitosVioladosSelecionadosPelaVitima);
			incidente.setDataRegistro(new Date());

			IncidenteDao.salvar(incidente);
			System.out.println("ta dando bom hein");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void listar() {
		incidentes = IncidenteDao.listar();
	}
	
	public Incidente getIncidente() {
		return incidente;
	}

	public void setIncidente(Incidente incidente) {
		this.incidente = incidente;
	}

	public ArrayList<String> getDireitosVioladosSelecionadosPelaVitima() {
		return direitosVioladosSelecionadosPelaVitima;
	}

	public void setDireitosVioladosSelecionadosPelaVitima(ArrayList<String> direitosVioladosSelecionadosPelaVitima) {
		this.direitosVioladosSelecionadosPelaVitima = direitosVioladosSelecionadosPelaVitima;
	}

	public List<String> getPossiveisDireitosViolados() {
		return possiveisDireitosViolados;
	}

	public void setPossiveisDireitosViolados(List<String> possiveisDireitosViolados) {
		this.possiveisDireitosViolados = possiveisDireitosViolados;
	}

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

	public List<Incidente> getIncidentes() {
		return incidentes;
	}

	public void setIncidentes(List<Incidente> incidentes) {
		this.incidentes = incidentes;
	}

}