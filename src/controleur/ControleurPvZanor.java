package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import javafx.scene.image.ImageView;
import modele.Terrain;
import modele.Plantes;
import modele.Plantes.PLANTES;
import modele.Terrain.TERRAIN;
import modele.Zombies;
import modele.Zombies.ZOMBIES;
import vue.VuePvZanor;

public class ControleurPvZanor extends Controleur{

	
	private Plantes.PLANTES plantesChoisi;
	private Zombies.ZOMBIES zombiesChoisi;
	public Boolean zombieBool = false;
	public ControleurPvZanor()
	{
		Logger.logMsg(Logger.INFO, "new ControleurPvZanor()");
	}
	
	public void initialiser()
	{
		
	}
	
	public void notifierChoixPlantes(PLANTES plante) {
		
		zombieBool = false;
		this.plantesChoisi = plante;
		
	}
	
	public void notifierChoixZombies(ZOMBIES zombie) {
		
		zombieBool = true;
		this.zombiesChoisi = zombie;
		
	}
	
	
	public void notifierClicJardin(double x, double y) {
		if(zombieBool = true) {
			VuePvZanor.getInstance().placerZombie(x, y, this.zombiesChoisi);
		}
		else {
			VuePvZanor.getInstance().planterPlantes(x, y, this.plantesChoisi);
		}
	}

}
