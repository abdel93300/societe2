public class Programme {
	public static void main(String[] args) {
		
	     // affichage cr�ation Etape 1 � 7
	     System.out.println("********************************************");
	     System.out.println("* Affichage � l'issue de l'�tape 7         *");
	     System.out.println("********************************************");
	     // cr�ation
	 	 Personne moi = new Personne("Abdel","Nemmiche",51);		
	 	 Personne formateur = new Personne("Eric","Siber");
	     System.out.println(moi);
		 System.out.println(formateur);
		// affichage cr�ation Etape 10
		 System.out.println("*************************************************");
	     System.out.println("* Affichage � l'issue de l'�tape 10             *");
	     System.out.println("* R�sultat du test de modification du nom ou    *");
	     System.out.println("* pr�nom d'une Personne �xistante ds le Systeme *");  
	     System.out.println("*************************************************");
		 moi.setPrenom("Abdel");
		 formateur.setNom("Siber");
		// affichage cr�ation Etape 11
		 System.out.println("********************************************************");
	     System.out.println("* Affichage � l'issue de l'�tape 11                    *");
	     System.out.println("* Cr�ation de 2 r�fugi�s h�rit�s de la classe Personne *");
	     System.out.println("********************************************************");
	     Refugie marine=new Refugie("Marine","LePen");
	     Refugie kader=new Refugie("Kader","Syrien");
		 kader.setAge(25);
		 kader.setEstRegularise(true);
	     System.out.println(marine);
		 System.out.println(kader);
		// affichage cr�ation Etape 12
		 System.out.println("********************************************************");
	     System.out.println("* Affichage � l'issue de l'�tape 12                    *");
	     System.out.println("* Ajout d'un mot de passe pour r�gulariser le R�fugi�  *");
	     System.out.println("********************************************************"); 
	     Refugie kiptanui=new Refugie("Kiptanui","Ethiopian");
		 kader.Regulariser("simplon");
		 kiptanui.Regulariser("simplon");
		 kiptanui.setAge(35);
		 marine.Regulariser("TonP�re");
	     System.out.println(marine);
		 System.out.println(kader);	
		 System.out.println(kiptanui);	
     	// affichage cr�ation Etape 13
		 System.out.println("********************************************************");
	     System.out.println("* Affichage � l'issue de l'�tape 13                    *");
	     System.out.println("* Ajout de l'adresse pour une Personne ou Refugi�      *");
	     System.out.println("********************************************************"); 
	   	 moi.setNumvoie("1 bis");
		 moi.setNomvoie("Avenue Foch");
		 moi.setCodepostal(75016);
		 moi.setVille("Paris");
	     System.out.println(moi);
	     Refugie sidi=new Refugie("Sidi","Mokhtar");
	     sidi.setCodepostal(75016);
		 sidi.setVille("Paris");
		 Refugie ahmed=new Refugie("Sidi","Mokhtar");
		 ahmed.setAge(16);
	  	 ahmed.setVille("Calais");
		 System.out.println(ahmed);
		 
				 }
		// affichage de certaines valeurs de variables pour debugger
		
	//	System.out.println(" Regul Marine : "+marine.estRegularise);
	//	System.out.println(" Regul kader : "+kader.estRegularise);
		
	}
