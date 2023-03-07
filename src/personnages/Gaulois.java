package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "�" + texte + "�");

	}

	private String prendreParole() {
		return "Le gaulois" + nom + ":";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la m�choire de " + romain.getNom());
		romain.recevoirCoup(force / 3);
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getEffetPotion() {
		return effetPotion;
	}

//	@Override
//	public String toString() {
//		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
//	}

//	public static void main(String[] args) {
//		public asterix(String nom, int force) {
//			this.nom = "Ast�rix";
//			this.force = 8;
//		}
//		
//		System.out.println(asterix);
//	}
	public static void main(String[] args) {
		asterix(nom = "Ast�rix", force = 8);
		System.out.println(asterix);
		
	}

}
