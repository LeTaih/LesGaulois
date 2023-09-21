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
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "<" + texte + ">");
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
		int forcePotion = effetPotionMin + random.nextInt(effetPotionMax-effetPotionMin+1);
		if (forcePotion>7) {
			parler("J'ai préparé une super potion de force " + forcePotion);
		} else {
			parler("J'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + forcePotion);
		}
		return forcePotion;
	}
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.preparerPotion();
		System.out.println(forcePotion);
	}
}
