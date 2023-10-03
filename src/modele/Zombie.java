package modele;

public class Zombie {
	public enum ZOMBIE {NORMAL, CONE}
	protected ZOMBIE zombie;
	
	public Zombie() {
		
	}
	
	public Zombie(ZOMBIE zombie) {
		this.zombie = zombie;
	}
}
