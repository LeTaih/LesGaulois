package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private String[] villageois;
	private int nbVillageois;
	private int nbVillageoisMaximum;
	
	public Village(String nom, Chef chef, String[] villageois, int nbVillageois) {
		this.nom = nom;
		this.chef = chef;
		villageois = new String[nbVillageoisMaximum];
		nbVillageois = 0;
	}
	
	public String getNom() {
		return nom;
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois.getNom();
		nbVillageois++;
		
	}
	private int nb;
	public int trouverHabitant(int nb) {
		return villageois[nb];
	}
	
	public static void main(String[] args) {
		Village village;
		Chef chef;
		String villageois[];
		village = new Village("Village des Irréductibles", chef, villageois[], 0);
		
		System.out.println(village.getNom());
		Gaulois gaulois = village.trouverHabitant(30);
		}
	
	}
	
//	public static void main(String[] args) {
//		public village(String nom, int nbVillageoisMaximum) {
//			this.nom = "Village des Irréductibles";
//			this.nbVillageoisMaximum = 30;
//		}
//	Gaulois gaulois = village.trouverHabitant(30);
//	}

}
