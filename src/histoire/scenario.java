package histoire;
import personnages.Gaulois;
import personnages.Romain;

public class scenario {
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Romain minus = new Romain("Minus",6);
		asterix.parler("Bonjour � tous");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		System.out.println(minus);
		asterix.frapper(minus);

		System.out.println(minus);
		asterix.frapper(minus);

		System.out.println(minus);
	}

}
