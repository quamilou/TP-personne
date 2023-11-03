
public class UtilPersonne{

	public static void main(String[] args) {
		
		Personne pers1;
		pers1 = new Personne();
		Personne pers2;
		pers2 = new Personne();
		
		
		pers1.initialiser("Derepper", "Florian", 21 );
		pers2.initialiser("Saenz", "Quentin", 24 );
		pers1.afficheIdentite();
		pers2.afficheIdentite();
		pers1.anniversaire();
		pers1.afficheIdentite();
		pers2.afficheIdentite();
		
	}

}
