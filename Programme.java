// programme appelant la méthode principale (main)
public class Programme {
	public static void main(String[] args) {
		
	     // affichage création Etape 1 à 7
	     System.out.println("********************************************");
	     System.out.println("* Affichage à l'issue de l'étape 7         *");
	     System.out.println("********************************************");
	     // création  = instanciation de la classe Personne
	 	 Personne moi = new Personne("Abdel","Nemmiche",51);	
	 	 System.out.println(moi);
	 	 Personne formateur = new Personne("Eric","Siber");
	  /*	 System.out.println("Prenom formateur : "+formateur.getPrenom());
	 	 System.out.println("Nom formateur : "+formateur.nom); */
	  	 
		 System.out.println(formateur);
		// affichage des instances créées à l'étape 7 :  Etape 10
		 System.out.println("*************************************************");
	     System.out.println("* Affichage à l'issue de l'étape 10             *");
	     System.out.println("* Résultat du test de modification du nom ou    *");
	     System.out.println("* prénom d'une Personne éxistante ds le Systeme *");  
	     System.out.println("*************************************************");
		 moi.setPrenom("Abdel2");
		 formateur.setNom("Siber2");
		// affichage des instances Refugie héritées de la classe Personne : Etape 11
		 System.out.println("********************************************************");
	     System.out.println("* Affichage à l'issue de l'étape 11                    *");
	     System.out.println("* Création de 2 réfugiés hérités de la classe Personne *");
	     System.out.println("********************************************************");
	     Refugie marine=new Refugie("Marine","LePen");
	     Refugie kader=new Refugie("Kader","Syrien");
		 kader.setAge(25);
		 kader.setEstRegularise(true);
	     System.out.println(marine);
		 System.out.println(kader);
		// affichage création Etape 12
		 System.out.println("********************************************************");
	     System.out.println("* Affichage à l'issue de l'étape 12                    *");
	     System.out.println("* Ajout d'un mot de passe pour régulariser le Réfugié  *");
	     System.out.println("********************************************************"); 
	     Refugie kiptanui=new Refugie("Kiptanui","Ethiopian");
		 kader.Regulariser("simplon");
		 kiptanui.Regulariser("simplon");
		 kiptanui.setAge(35);
		 marine.Regulariser("TonPère");
	     System.out.println(marine);
		 System.out.println(kader);	
		 System.out.println(kiptanui);	
     	// affichage création Etape 13
		 System.out.println("********************************************************");
	     System.out.println("* Affichage à l'issue de l'étape 13                    *");
	     System.out.println("* Ajout de l'adresse pour une Personne ou Refugié      *");
	     System.out.println("********************************************************"); 
	   	 moi.setNumvoie("1 bis");
		 moi.setNomvoie("Avenue Foch");
		 moi.setCodepostal(75016);
		 moi.setVille("Paris");
	     System.out.println(moi);
	     Refugie sidi=new Refugie("Sidi","Mokhtar");
		 sidi.setNumvoie("101");
		 sidi.setNomvoie("Allée de la jungle");
	//   sidi.setCodepostal(59016);
	//	 sidi.setVille("Calais");
		 System.out.println(sidi);
		 Refugie ahmed=new Refugie("Ahmed","El Morrococo");
	//	 ahmed.setNumvoie("2");
	//	 ahmed.setNomvoie("Avenue du Prado");
		 ahmed.setCodepostal(13000);
		 ahmed.setVille("Marseille");
		 System.out.println(ahmed);
	//	 System.out.println("longueur adresse de ahmed : " + ahmed.lg_adresse);
		 
				 }
	
		// affichage de certaines valeurs de variables pour debugger
		
	//	System.out.println(" Regul Marine : "+marine.estRegularise);
	//	System.out.println(" Regul kader : "+kader.estRegularise);
		
	}
