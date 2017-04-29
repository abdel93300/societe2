
public class Personne {
	public Personne(String nom, String prenom, Integer age) {
		this.prenom = prenom;
		this.nom = nom;
		this.age=age;
	}
	
	String prenom;
	String nom;
	Integer age;
	
	
	public String toString() {
		// TODO Auto-generated method stub
		if (age != null) 
		return prenom+" "+nom+ "age :" +age;
		else return prenom+nom;		
	}

		
	}
