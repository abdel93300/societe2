public class Programme2 {
	public static void main(String[] args) {
		// création
		Personne2 formateur = new Personne2();
		Personne2 moi = new Personne2();
        formateur.setNom("Sibert");
        formateur.setPrenom("Eric");
        formateur.setAge(0);
        moi.setNom("NEMMICHE");
        moi.setPrenom("Abdel");
        moi.setAge(51);
		// affichage;
		System.out.println(moi);
		System.out.println(formateur);
	}
}