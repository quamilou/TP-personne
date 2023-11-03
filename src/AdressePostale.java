public class AdressePostale {
	protected String Adresse1;
	protected String Adresse2;
	protected String CodePostal;
	protected String Ville;
	
	public AdressePostale(String adresse1, String adresse2, String codePostal, String ville) {
		Adresse1 = adresse1;
		Adresse2 = adresse2;
		CodePostal = codePostal;
		Ville = ville;
	}
	@Override
	public String toString() {
		if (Adresse2 == null) {
			return "AdressePostale [Adresse1=" + Adresse1 + ", CodePostal=" + CodePostal
					+ ", Ville=" + Ville + "]";
		}else{
			return "AdressePostale [Adresse1=" + Adresse1 + ", Adresse2=" + Adresse2 + ", CodePostal=" + CodePostal
					+ ", Ville=" + Ville + "]";}
	}
	public String getAdresse1() {
		return Adresse1;
	}
	public void setAdresse1(String adresse1) {
		Adresse1 = adresse1;
	}
	public String getAdresse2() {
		return Adresse2;
	}
	public void setAdresse2(String adresse2) {
		Adresse2 = adresse2;
	}
	public String getCodePostal() {
		return CodePostal;
	}
	public void setCodePostal(String codePostal) {
		CodePostal = codePostal;
	}
	public String getVille() {
		return Ville;
	}
	public void setVille(String ville) {
		Ville = ville;
	}
}
