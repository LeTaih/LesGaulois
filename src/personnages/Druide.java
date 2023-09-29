package personnages;
import java.util.Random;

public class Druide {

	private int forcePotion = 1;
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		super();
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � " + effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "�" + texte + "�");
	}
	private String prendreParole() {
		return("Le druide " + nom + " : ");
	}
	public int getEffetPotionMin() {
		return effetPotionMin;
	}
	public int getEffetPotionMax() {
		return effetPotionMax;
	}

	public int preparerPotion() {
		Random random = new Random();
		forcePotion = effetPotionMin + random.nextInt(effetPotionMax-effetPotionMin+1);
		if (forcePotion>7) {
			parler("J'ai pr�par� une super potion de force " + forcePotion);
		} else {
			parler("J'ai pas trouv� tous les ingr�dients, ma potion est seulement de force " + forcePotion);
		}
		return forcePotion;
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Ob�lix") {
			parler("Non, Ob�lix !... Tu n�auras pas de potion magique !");
		} else {
			gaulois.boirePotion(forcePotion);
		}
	}
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
	}
}
