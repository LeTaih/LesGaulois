package personnages;

public class Gaulois {
	private String nom;
	private int force;
	public int effetPotion = 1;
	
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
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
	
	
	
	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
		parler(" Merci Druide, je sens que ma force est " + effetPotion + " fois d�cupl�e. ");
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "�" + texte + "�");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom());
		romain.recevoirCoup(force / 3 * effetPotion);
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public static void main(String[] args) {
		Romain caesar = new Romain("Caesar",7);
		Gaulois asterix = new Gaulois("Ast�rix",8);
		System.out.println(asterix);
		asterix.parler("Hello");
		asterix.boirePotion(1);
		asterix.frapper(caesar);
	}
	
}
