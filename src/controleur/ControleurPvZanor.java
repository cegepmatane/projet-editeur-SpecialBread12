package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import javafx.scene.image.ImageView;
import modele.Terrain;
import modele.Plantes;
import modele.Plantes.PLANTES;
import modele.Terrain.TERRAIN;
import vue.VuePvZanor;

public class ControleurPvZanor extends Controleur{

	
	private Plantes.PLANTES plantesChoisi;
	public ControleurPvZanor()
	{
		Logger.logMsg(Logger.INFO, "new ControleurPvZanor()");
	}
	
	public void initialiser()
	{
		
	}
	
	public void notifierChoixPlantes(PLANTES plante) {
		
		
		this.plantesChoisi = plante;
		
	}
	
	
	public void notifierClicPlantes(double x, double y) {
		VuePvZanor.getInstance().planterPlantes(x, y, this.plantesChoisi);
	}

}
