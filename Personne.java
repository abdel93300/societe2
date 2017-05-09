// classe "m�re" Personne contenant toutes les informations d'une Personne 
public class Personne {

	public  String prenom;
	public  String nom;
	public  Integer age;
	public  String numvoie;
	public  String nomvoie;
	public  Integer codepostal; 
	public  String ville;

	// seuls les nom et pr�nom sont obligatoires		
	public Personne( String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}
	// constructeur contenant les nom et pr�nom et age
	public Personne(String prenom, String nom, Integer age) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
	}
	
	public Personne(String prenom, String nom, Integer age, String numvoie, String nomvoie) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.numvoie = numvoie;
		this.nomvoie = nomvoie;
	}

	public Personne(String prenom, String nom, Integer age, String numvoie, String nomvoie, Integer codepostal) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.numvoie = numvoie;
		this.nomvoie = nomvoie;
		this.codepostal = codepostal;
	}
	public Personne(String prenom, String nom, Integer age, String numvoie, String nomvoie, Integer codepostal,  String ville) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.age = age;
		this.numvoie = numvoie;
		this.nomvoie = nomvoie;
		this.codepostal = codepostal;
		this.ville = ville;
	}
	
	   public String getNom() {
		      return this.nom;
		   }
	   

	   public String getPrenom() {
	      return this.prenom;
	   }

	   public int getAge() {
		      return this.age;
		   }
	   public void setAge( int newAge) {
		      this.age = newAge;
		   }
	   
	   public void setVille( String newVille) {
		      this.ville = newVille;
		   }



		   public String getNumvoie() {
			      return this.numvoie;
			   }
		   public String getNomvoie() {
			      return this.nomvoie;
			   }
		   public Integer getCodepostal() {
			      return this.codepostal;
			   }
		   public String getVille() {
			      return this.ville;
			   }
		   

		   public void setNumvoie( String newNumvoie) {
			      this.numvoie = newNumvoie;
			   }
		   public void setNomvoie( String newNomvoie) {
			      this.nomvoie = newNomvoie;
			   }
		   public void setCodepostal( int newCodepostal) {
			      this.codepostal = newCodepostal;
			   }

		  
// interdire la modification du nom d'une personne existante dans le syst�me
		   public void setNom(String newNom) {
		    if (nom == null) this.nom= newNom;
		    else System.out.println("Modification nom interdite pour : "+ this.nom +" "+this.prenom);
		    		 };

// interdire la modification du pr�nom d'une personne existante dans le syst�me
		   public void setPrenom( String newPrenom) {
			   if (prenom == null) this.prenom= newPrenom;
			    else System.out.println("Modification pr�nom interdite pour : " + this.nom+" " +this.prenom);
			    		 };

	   
	public String toString() {
		String description = this.prenom + " " + this.nom;
		if (this.age != null) {
			 description = description + " : " + this.age + " an(s)";
		}
		if (this.numvoie!=null && this.nomvoie!=null && this.codepostal!=0 && this.ville!=null) {
		 description=description+ " Adresse : " + this.numvoie+ " "+this.nomvoie+ " "+this.codepostal+ " "+this.ville;
		}
		else description=description+ " Adresse inconnue ";
		 	 	
		return description;
	}

}



