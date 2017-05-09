// class Refugie h�rit�e de la class Personne
public class Refugie extends Personne {
	 boolean estRegularise=false;
		public  String numvoie;
		public  String nomvoie;
		public  Integer codepostal; 
		public  String ville;
	 
	  public void setEstRegularise( boolean estRegularise) {
	     this.estRegularise = estRegularise;
	  }
	 
	 public Refugie(String prenom, String nom){
			super(prenom,nom);
			setEstRegularise(false);
	 }
 // methode de r�gularisation selon le mot de passe
   public boolean Regulariser(String mdp) {
	   if (mdp=="simplon") {
		    return(Refugie.this.estRegularise=true);}
	   else return (Refugie.this.estRegularise=false); 	  
	   }

// d�terminer si le d�m�nagement est possible	   
  public boolean demenager(String numDeVoie, String nomDeVoie, int codePostal, String ville) {
	   if (Refugie.this.estRegularise) 
		   return(true);
		   else return(false);
	   } 
	   

  // methode d'affichage de l'information de r�gularisation
  // r�cup�ration du contenu de la m�thode m�re (super) qui contient les informations nominatives de la Personne
 public String toString() {
	 String description = super.toString();
        	 if (!this.estRegularise)
		 {description = description +  " n'est  pas r�gularis�(e)";
		 	}  
	 else {description = description +  " est r�gularis�(e)";
	 	}  ;
		 	return(description);
 }
}


