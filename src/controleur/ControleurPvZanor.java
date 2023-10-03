package controleur;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Controleur;
import javafx.scene.image.ImageView;
import modele.Terrain;
import modele.Terrain.TERRAIN;
import vue.VueJardinator;
import vue.VuePvZanor;

public class ControleurPvZanor extends Controleur{

	public ControleurPvZanor()
	{
		Logger.logMsg(Logger.INFO, "new ControleurPvZanor()");
	}
	
	public void initialiser()
	{
		
	}
	
	
	public void notifierClicPlantes(double x, double y) {
		VuePvZanor.getInstance().planterSemis(x, y, this.planteChoisi);
	}

}
