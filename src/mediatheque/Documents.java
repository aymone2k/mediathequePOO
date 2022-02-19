package mediatheque;

public abstract class Documents {//abstract permet de proteger contre la création de new document
	
	private int id;
    private String titre;
    private String auteur;
    private String description;
   private int anneeEdition;
    
    
	public Documents(int id, String titre, String auteur, String description, int anneeEdition) {
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.description = description;
		this.anneeEdition= anneeEdition;
	}


	public int getId() {
		return this.id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitre() {
		return this.titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getAuteur() {
		return this.auteur;
	}


	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}


	public String getDescription() {
		return this.description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getAnneeEdition() {
		return this.anneeEdition;
	}


	public void setAnneeEdition(int anneeEdition) {
		this.anneeEdition = anneeEdition;
	}
    
    public void afficherTitre() {
    	System.out.println("Titre Documment: " + titre);
    }
    public abstract void lireDocument() ;//si methode abstraite == cette methode devra obligatoirement etre implémentée dans toutes les classes qui en hérite 
    	
}
