public class Personne {

	public  String prenom;
	public String nom;
	public Integer age;
		
	public Personne(String nom, String prenom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}

	public Personne(String prenom, String nom, Integer age) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}


	   public int getAge() {
		      return this.age;
		   }

		   public String getNom() {
		      return this.nom;
		   }

		   public String getPrenom() {
		      return this.prenom;
		   }

		   public void setAge( int newAge) {
		      this.age = newAge;
		   }

		   public void setNom(String newNom) {
		    if (nom == null) this.nom= newNom;
		    else System.out.println("Modification nom interdite pour : "+ this.nom +" "+this.prenom);
		    		 };

		   public void setPrenom( String newPrenom) {
			   if (prenom == null) this.prenom= newPrenom;
			    else System.out.println("Modification prénom interdite pour : " + this.nom+" " +this.prenom);
			    		 };

	   
	public String toString() {
		String description = prenom + " " + nom;
		if (this.age != null) {
			 description = description + " : " + this.age + " an(s)";
		}
		
			 	;  	
		return description;
	}

}



