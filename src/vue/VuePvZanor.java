package vue;
import javax.swing.JButton;

import com.sun.media.jfxmedia.logging.Logger;

import architecture.Vue;
import controleur.ControleurPvZanor;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import modele.Legume.LEGUME;
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
		
		Button piscineJour = (Button)lookup("#piscine-jour");
		piscineJour.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("piscine jour");
				ImageView imageTerrain = (ImageView)lookup("#terrain");
				
				imageTerrain.setImage(new Image("ArriereFond-Piscine-Jour.png"));
			}});
		Button piscineNuit = (Button)lookup("#piscine-nuit");
		piscineNuit.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("piscine nuit");
				ImageView imageTerrain = (ImageView)lookup("#terrain");
				
				imageTerrain.setImage(new Image("ArriereFond-Piscine-Nuit.png"));
			}});
		Button toitJour = (Button)lookup("#toit-jour");
		toitJour.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("toit jour");
				ImageView imageTerrain = (ImageView)lookup("#terrain");
				
				imageTerrain.setImage(new Image("ArriereFond-Toit-Jour.png"));
			}});
		
		Button toitNuit = (Button)lookup("#toit-nuit");
		toitNuit.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("toit nuit");
				ImageView imageTerrain = (ImageView)lookup("#terrain");
				
				imageTerrain.setImage(new Image("ArriereFond-Toit-Nuit.png"));
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
		
		Button zombie1 = (Button)lookup("#zombie1");
		zombie1.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Clic sur zombie1");
				
			}});
		
		Button zombie2 = (Button)lookup("#zombie2");
		zombie2.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Clic sur zombie2");
				
			}});
		
		Button zombie3 = (Button)lookup("#zombie3");
		zombie3.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Clic sur zombie3");
				
			}});
		
		Button zombie4 = (Button)lookup("#zombie4");
		zombie4.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Clic sur zombie4");
				
			}});
		
		Button zombie5 = (Button)lookup("#zombie5");
		zombie5.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Clic sur zombie5");
				
			}});
		
		Button zombie6 = (Button)lookup("#zombie6");
		zombie6.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Clic sur zombie6");
				
			}});
		
		

		
	}
	public void planterSemis(double x, double y, LEGUME legumeChoisi) {
		//Ajouter la carotte dans le java
		
		ImageView legumePlantee = new ImageView();
		if(legumeChoisi == LEGUME.CAROTTE) {
		legumePlantee.setImage(new Image("vue/decoration/semis/carotte.png"));
		}
		if(legumeChoisi == LEGUME.CHOU) {
		legumePlantee.setImage(new Image("vue/decoration/semis/chou.png"));
		}
		legumePlantee.setPreserveRatio(true);
		legumePlantee.setFitHeight(100);
		legumePlantee.setY(y - 50);
		legumePlantee.setX(x - 15);
		
		AnchorPane cloture = (AnchorPane)lookup("#jardin-cloture");
		cloture.getChildren().add(legumePlantee);
		
	}
}
