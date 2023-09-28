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
		
		Button entreeJour = (Button)lookup("#entree-jour");
		entreeJour.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("entree jour");
				ImageView imageTerrain = (ImageView)lookup("#terrain");
				
				imageTerrain.setImage(new Image("ArriereFond-Entree-Jour.png"));
			}});
		
		Button entreeNuit = (Button)lookup("#entree-nuit");
		entreeNuit.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("entree nuit");
				ImageView imageTerrain = (ImageView)lookup("#terrain");
				
				imageTerrain.setImage(new Image("ArriereFond-Entree-Nuit.png"));
			}});
		
		
		Button emplacement1 = (Button)lookup("#emplacement-1");
		emplacement1.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement1");
				
			}});
		Button emplacement2 = (Button)lookup("#emplacement-2");
		emplacement2.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement2");
				
			}});
		Button emplacement3 = (Button)lookup("#emplacement-3");
		emplacement3.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement3");
				
			}});
		Button emplacement4 = (Button)lookup("#emplacement-4");
		emplacement4.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement4");
				
			}});
		Button emplacement5 = (Button)lookup("#emplacement-5");
		emplacement5.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement5");
				
			}});
		
		Button emplacement6 = (Button)lookup("#emplacement-6");
		emplacement6.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement6");
				
			}});
		
		Button emplacement7 = (Button)lookup("#emplacement-7");
		emplacement7.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement7");
				
			}});
		
		Button emplacement8 = (Button)lookup("#emplacement-8");
		emplacement8.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement8");
				
			}});
		
		Button emplacement9 = (Button)lookup("#emplacement-9");
		emplacement9.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement9");
				
			}});
		
		
		

	}
}
