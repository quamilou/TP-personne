public class Personne {
	protected String nom;
	protected String prenom;
	protected int age;
	
	public void anniversaire() {
		age += 1;
	}
	
	public void initialiser(String nomInit, String prenomInit, int ageInit) {
		nom = nomInit;
		prenom = prenomInit;
		age = ageInit;
	}
	
	public void afficheIdentite() {
		System.out.println("je suis "+nom+" "+prenom+" et j'ai "+age+" ans");
	}
}
