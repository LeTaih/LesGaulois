package histoire;
import personnages.Gaulois;
import personnages.Druide;
import personnages.Romain;

public class scenario {
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Gaulois obelix = new Gaulois("Ob�lix",25);
		Romain minus = new Romain("Minus",6);
		Druide panoramix = new Druide("Panoramix",5,10);
		panoramix.parler("Je vais aller preparer une petite potion...");
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		obelix.parler("Par B�l�nox, ce n'est pas juste !");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
	}

}

