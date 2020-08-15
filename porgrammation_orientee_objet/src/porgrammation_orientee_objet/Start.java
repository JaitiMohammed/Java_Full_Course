package porgrammation_orientee_objet;

public class Start {

	public static void main(String[] args) {
		
		Client c1 = new Client("EE111222","Salim","Omar","0644444");
		c1.Afficher();
		
		Compte cpt1 = new Compte(2000.44,0,c1);
		//cpt1.Crediter(3000);
		cpt1.Crediter(200, cpt1);
		
		System.out.println(cpt1.getSolde());
		
	}

}
