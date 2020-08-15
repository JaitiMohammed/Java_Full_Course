package porgrammation_orientee_objet;

public class Compte {
	
	private double solde;
	private int code;
	private Client client;
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Compte(double solde, int code, Client client) {
		super();
		this.solde = solde;
		this.code = code;
		this.client = client;
	}
	
	public void Crediter(double somme) {
		this.solde = this.solde+somme;
	}
	public void Crediter(double somme,Compte compte) {
		compte.solde = compte.solde+somme;
		this.code ++;
		//compte.solde = compte.solde-somme;
		
	}
	
}
