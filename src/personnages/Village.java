package personnages;

import java.util.Iterator;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois++;
	}
	
	public Gaulois trouverHabitant(int nb) {
		return villageois[nb];
	}
	
	public void afficherVillageois() {
		System.out.println("Dans le village du chef "+chef.getNom()+" vivent les légendaires gaulois :");
		for(int i=0;i<nbVillageois;i++) {
			System.out.println("- "+villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irréductibles",30);
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Astérix",8);
		village.ajouterHabitant(asterix);
		Gaulois obelix = new Gaulois("Obelix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();

//		Gaulois gaulois = village.trouverHabitant(30);
//		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 30
//		at personnages.Village.trouverHabitant(Village.java:29)
//		at personnages.Village.main(Village.java:33)
//		car on essaie de trouver le villageois n°30 alors que ça commence à 0 donc le dernier
//		des 30 villageois est le n°29; le n°30 est donc pas dans le tableau
		
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		RENVOI : 
//		null
//		Pour la même raison sauf que 1 est compris dans le tableau, il est juste vide.
		
	}
}
