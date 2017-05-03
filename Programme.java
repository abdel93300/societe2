public class Programme {
	public static void main(String[] args) {
		// création
	
		Personne moi = new Personne();		
		Personne formateur = new Personne();
		 moi.setNom("Abdel");
	     moi.setPrenom("Nemmiche");
	     moi.setAge(51);
	     formateur.setNom("Eric");
	     formateur.setPrenom("Siber");
	   	     
		// affichage
		System.out.println(moi);
		System.out.println(formateur);
	}
}