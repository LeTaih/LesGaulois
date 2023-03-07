package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois;
	private int nbVillageoisMaximum;
	
	public Village(String nom, Chef chef, Gaulois[] villageois, int nbVillageois) {
		this.nom = nom;
		this.chef = chef;
		villageois = new Gaulois[nbVillageoisMaximum];
		nbVillageois = 0;
	}
	
	public String getNom() {
		return nom;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois++;
		
	}
	
	public Gaulois trouverHabitant(int nb) {
		return villageois[nb];
	}
	
	public static void main(String[] args) {
		Village village;
		Chef chef;
		Gaulois villageois[];
		village = new Village("Village des Irréductibles", chef, villageois, 0);
		
		System.out.println(village.getNom());
		Gaulois gaulois = village.trouverHabitant(30);
		
	
	}
	
//	public static void main(String[] args) {
//		public village(String nom, int nbVillageoisMaximum) {
//			this.nom = "Village des Irréductibles";
//			this.nbVillageoisMaximum = 30;
//		}
//	Gaulois gaulois = village.trouverHabitant(30);
//	}

}
