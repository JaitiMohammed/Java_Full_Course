package porgrammation_orientee_objet;

public class Client {
	
	private String CIN;
	private String Nom;
	private String Prenom;
	private String Tel;
	public String getCIN() {
		return CIN;
	}
	public void setCIN(String cIN) {
		CIN = cIN;
	}
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	public String getTel() {
		return Tel;
	}
	public void setTel(String tel) {
		Tel = tel;
	}
	public Client(String cIN, String nom, String prenom, String tel) {
		super();
		CIN = cIN;
		Nom = nom;
		Prenom = prenom;
		Tel = tel;
	}
	
	public Client(String cIN, String nom, String prenom) {
		super();
		CIN = cIN;
		Nom = nom;
		Prenom = prenom;
	}
	@Override
	public String toString() {
		return "Client [CIN=" + CIN + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Tel=" + Tel + "]";
	}
	
	public void Afficher() {
		System.out.println(toString());
	}
	
	
}
