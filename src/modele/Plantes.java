package modele;

import donnee.Exportable;

public class Plantes implements Exportable {
	public enum PLANTES {SUNFLOWER, PEASHOOTER, CHOUSHOOTER, CORNSHOOTER, FASTSHOOTER, FIRETRUNK, NENUPHAR, PLANTPOT, TALLNUT}
	protected PLANTES Plantes;
	protected double x;
	protected double y;
		public Plantes() {
			
		}
		
		public Plantes(PLANTES Plantes) {
			
		}
		
		@Override
		public String exporterXML() {
			String xml = "";
			xml += "<sorte>" + this.Plantes + "</sorte>";
			xml += "<coordonnees>" + this.x + "," + this.y + "</coordonnees>";
			return "<plante>" + xml + "</plante>";
		}
		@Override
		public String exporterJSON() {
			return "NON-IMPLEMENTE";
		}
}
