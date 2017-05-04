// class Refugie héritée de la class Personne
public class Refugie extends Personne {
	 static boolean estRegularise=false;
	 public Refugie(String prenom, String nom, int age){
			super(prenom,nom,age);
			estRegularise=false;
	 }
 public Refugie(String prenom, String nom, int age, boolean estRegularise) {
	 super(prenom,nom,age);	
	 Refugie.estRegularise=estRegularise;
	
		}
 
 public boolean getEstRegularise() {
     return Refugie.estRegularise;
  }

  public void setestRegularise( boolean estRegularise) {
     Refugie.estRegularise = estRegularise;
  }
  
 public String toString() {
	 String description = this.prenom + " " +this.nom + " : " + this.age + " an(s)";
	 if (Refugie.estRegularise=false)
		 {description = description +  " n'est pas régularisé";
		 	}  
	 else {description = description +  " est régularisé";
	 	}  ;
		 	return(description);
 }
}


