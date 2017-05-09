public class Personne {

	public  String prenom;
	public  String nom;
	public  Integer age;
	public  String numvoie=" ";
	public  String nomvoie=" ";
	public  Integer codepostal=0; 
	public  String ville=" ";

		
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
	   public int getAge() {
		      return this.age;
		   }

		   public String getNom() {
		      return this.nom;
		   }

		   public String getPrenom() {
		      return this.prenom;
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
		   
		   public void setAge( int newAge) {
			      this.age = newAge;
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
		   public void setVille( String newVille) {
			      this.ville = newVille;
			   }
		  
// interdire la modification du nom d'une personne existante dans le système
		   public void setNom(String newNom) {
		    if (nom == null) this.nom= newNom;
		    else System.out.println("Modification nom interdite pour : "+ this.nom +" "+this.prenom);
		    		 };

// interdire la modification du prénom d'une personne existante dans le système
		   public void setPrenom( String newPrenom) {
			   if (prenom == null) this.prenom= newPrenom;
			    else System.out.println("Modification prénom interdite pour : " + this.nom+" " +this.prenom);
			    		 };

	   
	public String toString() {
		String description = prenom + " " + nom;
		if (this.age != null) {
			 description = description + " : " + this.age + " an(s)";
		}
		if (getNumvoie()!=null && getNumvoie()!=null && getCodepostal()!=0 && getVille()!=null) {
		 description=description+ " Adresse : " + getNumvoie()+ " "+getNomvoie()+ " "+getCodepostal()+ " "+getVille();
		}
		else description=description+ " Adresse inconnue ";
		 	 	
		return description;
	}

}



