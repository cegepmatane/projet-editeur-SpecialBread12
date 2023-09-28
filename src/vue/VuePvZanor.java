package vue;
import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurPvZanor;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modele.Terrain.TERRAIN;

public class VuePvZanor extends Vue {

	protected ControleurPvZanor controleur;
	protected static VuePvZanor instance = null; 
	public static VuePvZanor getInstance() {if(null==instance)instance = new VuePvZanor();return VuePvZanor.instance;}; 
	
	private VuePvZanor() 
	{
		super("PvZanor.fxml", VuePvZanor.class, 1294,743);
		super.controleur = this.controleur = new ControleurPvZanor();
		Logger.logMsg(Logger.INFO, "new VuePvZanor()");
	}
		
	public void activerControles()
	{
		super.activerControles();
		
		Button test = (Button) lookup("#entree-jour");
		test.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("BEAN");
				
			}});
		
		//Button actionToucherPlante = (Button) lookup("#emplacement-1");
		/*
		Button actionCalculatrice = (Button) lookup("#action-calculatrice");
		actionCalculatrice.setOnAction(new EventHandler<ActionEvent>() 
		{
            @Override public void handle(ActionEvent e) 
            {
            	Logger.logMsg(Logger.INFO, "Bouton Calculatrice activé");
            	controleur.notifierEvenement(ActionNavigation.CALCULATRICE);
            }
        });
		*/
		ImageView imageTerrain = (ImageView)lookup("#terrain");
		
		imageTerrain.setImage(new Image("ArriereFond-Entree-Nuit.png"));
	}
}
