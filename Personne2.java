
public class Personne2 {
	private String nom;
	private String prenom; 
	private Integer age;
	
	 	   public Integer getAge() {
		 	      return age;
		 	   }
		 	   public void setNom(String newNom) {
		 	      nom =newNom;
		 	   }
		 
		 	   public void setPrenom( String newPrenom) {
		 	      prenom = newPrenom;
		 	   }
		 	   public void setAge( int newAge) {
		 		      age = newAge;
		 	   }
	public String toString() {
		String description = prenom + " " + nom;
		if (this.age != 0) {
			description = description + " : " + this.age + " an(s)";
		}
		else description = description + " : "+ " Age inconnu";
return description;
	}
	}
