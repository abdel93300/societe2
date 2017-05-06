public class Programme {
	public static void main(String[] args) {
		// création
	
		 Personne moi = new Personne("Abdel","Nemmiche",51);		
	     Personne formateur = new Personne("Eric","Siber");
	     Refugie marine=new Refugie("Marine","LePen");
	     Refugie kader=new Refugie("Kader","Syrien");
		 moi.setPrenom("Abdel");
		 formateur.setNom("Siber");
		 kader.setAge(25);
		 kader.setEstRegularise(true);
		 kader.Regulariser("simplon");
		 marine.Regulariser("TonPère");
		
		// affichage
		System.out.println(moi);
		System.out.println(formateur);
		System.out.println(marine);
		System.out.println(kader);
		System.out.println(" Regul Marine : "+marine.estRegularise);
		System.out.println(" Regul kader : "+kader.estRegularise);
		
	}
}