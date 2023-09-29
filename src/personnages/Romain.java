package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force >=0 : "La force d'un romain doit être positive.";
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "«" + texte + "»");
	}
	
	private String prendreParole() {
		return("Le romain " + nom + " : ");
	}
	public void recevoirCoup(int forceCoup) {
		force -=forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
	@Override
	public String toString() {
		return "Romain [nom=" + nom + ", force=" + force + "]";
	}
	public static void main(String[] args) {
		Romain caesar = new Romain("Caesar",-3);
		Gaulois asterix = new Gaulois("Astérix",8);
		System.out.println(asterix);
		caesar.parler("Hello");
		caesar.recevoirCoup(8);
	}
}
