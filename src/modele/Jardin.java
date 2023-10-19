package modele;

import java.util.ArrayList;
import java.util.List;

import donnee.Exportable;

public class Jardin implements Exportable {

	public enum TERRAIN {BACS, ENCLOS, TERRE, RANGS, AUCUN};
	protected TERRAIN terrain = TERRAIN.AUCUN;

	protected List<Plantes> plantesDuJardin;
	
	public Jardin() {
		this.plantesDuJardin = new ArrayList<Plantes>();
	}
	public TERRAIN getTerrain() {
		return terrain;
	}

	public void setTerrain(TERRAIN terrain) {
		this.terrain = terrain;
	}
	
	public List<Plantes> getPlantesDuJardin() {
		return plantesDuJardin;
	}

	public void setPlantesDuJardin(List<Plantes> plantesDuJardin) {
		this.plantesDuJardin = plantesDuJardin;
	}
	
	public void ajouterPlante(Plantes plante)
	{
		this.plantesDuJardin.add(plante);
	}


	@Override
	public String exporterXML() {
		
		String xml = "";
		xml += "<terrain>" + this.terrain + "</terrain>";
		xml += "<plantes>";
		for(Plantes plante:this.plantesDuJardin)
		{
			xml+=plante.exporterXML();
		}
		xml += "</plantes>";
		return "<jardin>" + xml + "</jardin>";
	}

	@Override
	public String exporterJSON() {
		return "";
	}

}