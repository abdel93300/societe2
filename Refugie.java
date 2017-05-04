// class Refugie h�rit�e de la class Personne
public class Refugie extends Personne {
	 boolean estRegularise=false;
	 
	 public boolean ilEstRegularise() {
		 return estRegularise;
	 }

	  public void setEstRegularise( boolean estRegularise) {
	     this.estRegularise = estRegularise;
	  }
	 
	 public Refugie(String prenom, String nom){
			super(prenom,nom);
			setEstRegularise(false);
	 }
 public Refugie(String prenom, String nom, int age) {
	 super(prenom,nom,age);	
	 //this.estRegularise=estRegularise;
	
		}
 
 public String toString() {
	 String description = super.toString();
	 if (!estRegularise)
		 {description = description +  " n'est  pas r�gularis�(e)";
		 	}  
	 else {description = description +  " est r�gularis�(e)";
	 	}  ;
		 	return(description);
 }
}


