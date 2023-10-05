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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.shape.Rectangle;
import modele.Plantes;
import modele.Plantes.PLANTES;
import modele.Terrain.TERRAIN;
import modele.Zombie.ZOMBIE;
import modele.Zombies.ZOMBIES;
import modele.Zombies;
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
				controleur.notifierChoixPlantes(Plantes.PLANTES.SUNFLOWER);
			}});
		Button emplacement2 = (Button)lookup("#emplacement-2");
		emplacement2.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement2");
				controleur.notifierChoixPlantes(Plantes.PLANTES.PEASHOOTER);
			}});
		Button emplacement3 = (Button)lookup("#emplacement-3");
		emplacement3.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement3");
				controleur.notifierChoixPlantes(Plantes.PLANTES.CHOUSHOOTER);
			}});
		Button emplacement4 = (Button)lookup("#emplacement-4");
		emplacement4.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement4");
				controleur.notifierChoixPlantes(Plantes.PLANTES.CORNSHOOTER);
			}});
		Button emplacement5 = (Button)lookup("#emplacement-5");
		emplacement5.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement5");
				controleur.notifierChoixPlantes(Plantes.PLANTES.FASTSHOOTER);
			}});
		
		Button emplacement6 = (Button)lookup("#emplacement-6");
		emplacement6.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement6");
				controleur.notifierChoixPlantes(Plantes.PLANTES.FIRETRUNK);
			}});
		
		Button emplacement7 = (Button)lookup("#emplacement-7");
		emplacement7.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement7");
				controleur.notifierChoixPlantes(Plantes.PLANTES.NENUPHAR);
				
			}});
		
		Button emplacement8 = (Button)lookup("#emplacement-8");
		emplacement8.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement8");
				controleur.notifierChoixPlantes(Plantes.PLANTES.PLANTPOT);
			}});
		
		Button emplacement9 = (Button)lookup("#emplacement-9");
		emplacement9.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("emplacement9");
				controleur.notifierChoixPlantes(Plantes.PLANTES.TALLNUT);
			}});
		
		Button zombie1 = (Button)lookup("#zombie1");
		zombie1.setOnAction(new EventHandler<>() {

			@Override
			public void handle(ActionEvent arg0) {
				System.out.println("Clic sur zombie1");
				controleur.notifierChoixZombies(Zombies.ZOMBIES.NORMAL);
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
		
		
		Rectangle jardinRectangle = (Rectangle)lookup("#jardin-rectangle");
		jardinRectangle.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent clic) {
				double x = clic.getX();
				double y = clic.getY();
			System.out.println("Clic jardin");	
			controleur.notifierClicJardin(x,y);
			
			}});
		
	}
	public void planterPlantes(double x, double y, PLANTES planteChoisi) {
		//Ajouter les plantes dans le java
		
		ImageView plantePlantee = new ImageView();
		if(planteChoisi == PLANTES.SUNFLOWER) {
		plantePlantee.setImage(new Image("vue/decoration/plantes/sunflower.jpg"));
		}
		if(planteChoisi == PLANTES.PEASHOOTER) {
		plantePlantee.setImage(new Image("vue/decoration/plantes/peashooter.jpg"));
		}
		if(planteChoisi == PLANTES.CHOUSHOOTER) {
		plantePlantee.setImage(new Image("vue/decoration/plantes/choushooter.jpg"));
		}
		if(planteChoisi == PLANTES.CORNSHOOTER) {
		plantePlantee.setImage(new Image("vue/decoration/plantes/cornshooter.jpg"));
		}
		if(planteChoisi == PLANTES.FASTSHOOTER) {
		plantePlantee.setImage(new Image("vue/decoration/plantes/fastshooter.jpg"));
		}
		if(planteChoisi == PLANTES.FIRETRUNK) {
		plantePlantee.setImage(new Image("vue/decoration/plantes/firetrunk.jpg"));
		}
		if(planteChoisi == PLANTES.NENUPHAR) {
		plantePlantee.setImage(new Image("vue/decoration/plantes/nenuphar.jpg"));
		}
		if(planteChoisi == PLANTES.PLANTPOT) {
		plantePlantee.setImage(new Image("vue/decoration/plantes/plantpot.jpg"));
		}
		if(planteChoisi == PLANTES.TALLNUT) {
		plantePlantee.setImage(new Image("vue/decoration/plantes/tallnut.jpg"));
		}
		plantePlantee.setPreserveRatio(true);
		plantePlantee.setFitHeight(100);
		plantePlantee.setY(y - 50);
		plantePlantee.setX(x -40);
		
		AnchorPane jardin = (AnchorPane)lookup("#jardin");
		jardin.getChildren().add(plantePlantee);
		
	}
	
	public void placerZombie(double x, double y, ZOMBIES zombiesChoisi) {
		
		ImageView zombiePlacer = new ImageView();
		if(zombiesChoisi == ZOMBIES.NORMAL) {
		zombiePlacer.setImage(new Image("vue/decoration/zombies/zombie_normal.png"));
		}
		
		zombiePlacer.setPreserveRatio(true);
		zombiePlacer.setFitHeight(100);
		zombiePlacer.setY(y - 50);
		zombiePlacer.setX(x -40);
		
		AnchorPane jardin = (AnchorPane)lookup("#jardin");
		jardin.getChildren().add(zombiePlacer);
	}
	
}
