// class Refugie héritée de la class Personne
public class Refugie extends Personne {
	 boolean estRegularise=false;
	 
	  public void setEstRegularise( boolean estRegularise) {
	     this.estRegularise = estRegularise;
	  }
	 
	 public Refugie(String prenom, String nom){
			super(prenom,nom);
			setEstRegularise(false);
	 }
 // methode de régularisation selon le mot de passe
   public boolean Regulariser(String mdp) {
	   if (mdp=="simplon") {
		    return(Refugie.this.estRegularise=true);}
	   else return (Refugie.this.estRegularise=false); 	  
	   }
	   
      
 // methhode d'affichage du message de régularisation
 public String toString() {
	 String description = super.toString();
        	 if (!this.estRegularise)
		 {description = description +  " n'est  pas régularisé(e)";
		 	}  
	 else {description = description +  " est régularisé(e)";
	 	}  ;
		 	return(description);
 }
}


