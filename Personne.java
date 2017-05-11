// classe "mère" Personne contenant toutes les informations d'une Personne 
public class Personne {

	public  String prenom;
	public  String nom;
	public  Integer age;
	public  String numvoie;
	public  String nomvoie;
	public  Integer codepostal; 
	public  String ville;
	public  String adresse="";

	// Constructor dont seuls les nom et prénom sont obligatoires		
	public Personne( String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}
	// constructeur contenant les nom et prénom et age
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

	// Getteurs et Setteurs 
	
	
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

		   public void setNumvoie( String newNumvoie) {
			      this.numvoie = newNumvoie;
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
		   

		   public void setNomvoie( String newNomvoie) {
			      this.nomvoie = newNomvoie;
			   }
		   public void setCodepostal( int newCodepostal) {
			      this.codepostal = newCodepostal;
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
		String description = this.prenom + " " + this.nom;
		
		
		
		if (this.age != null) {
			 description = description + " : " + this.age + " an(s)";
			
		}
		if (this.numvoie!=null) {
		this.adresse=this.adresse+this.numvoie+" ";
		}
		if (this.nomvoie!=null) {
			    this.adresse=this.adresse+this.nomvoie+" ";
		}
		if (this.codepostal!=null) {
			this.adresse=this.adresse+this.codepostal+" ";
		}
		else this.adresse=this.adresse+"";
		if (this.ville!=null) {
			this.adresse=this.adresse+this.ville;
		}
		// cas adresse entièrement renseignée
		//if (this.numvoie!=null && this.nomvoie!=null && this.codepostal!=null && this.ville!=null) {
		if (this.adresse.length()>1) {
			description=description+ " Adresse : " + this.adresse;	
		//	description=description+ " Adresse : " + this.numvoie+ " "+this.nomvoie+ " "+this.codepostal+ " "+this.ville;
		}
		// aucun élément de l'adresse n'est renseigné
		else description=description+ " Adresse inconnue  ";
		//manque le cas d'adresse partielle (algo. à optimiser)
		
	
		return description;
		
	}

}



