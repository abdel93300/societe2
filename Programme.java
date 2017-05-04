public class Programme {
	public static void main(String[] args) {
		// création
	
		 Personne moi = new Personne("Abdel","Nemmiche",51);		
	     Personne formateur = new Personne("Eric","Siber");
		 moi.setPrenom("Abdel");
		 formateur.setNom("Siber");
	     
	   	     
		// affichage
		System.out.println(moi);
		System.out.println(formateur);
	}
}