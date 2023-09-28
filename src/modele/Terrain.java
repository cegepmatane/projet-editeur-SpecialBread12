package modele;

public class Terrain {
	public enum TERRAIN {ENTREE_JOUR, ENTREE_NUIT}
	protected TERRAIN terrain;
	
	public Terrain(){
		
	}
	
	public Terrain(TERRAIN terrain) {
		this.terrain = terrain;
	}
}
