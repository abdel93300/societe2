public class Personne {

	private String prenom;
	private String nom;
	private Integer age;
	
	
	   public int getAge() {
		      return age;
		   }

		   public String getNom() {
		      return nom;
		   }

		   public String getPrenom() {
		      return prenom;
		   }

		   public void setAge( int newAge) {
		      age = newAge;
		   }

		   public void setNom(String newNom) {
		      nom = newNom;
		   }

		   public void setPrenom( String newPrenom) {
		      prenom = newPrenom;
		   }
	public String toString() {
		String description = prenom + " " + nom;
		if (this.age != null) {
			description = description + " : " + this.age + " an(s)";
		}
		return description;
	}

}



