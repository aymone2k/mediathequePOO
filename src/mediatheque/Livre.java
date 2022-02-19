package mediatheque;

public class Livre extends Documents{
	
	private String categorie;//science-fiction, bd, roman, ...
	private int nbPage;

//constructeur
	
	public Livre(int id, String titre, String auteur, String description, int anneeEdition, String categorie, int nbPage) {
		super(id, titre, auteur, description, anneeEdition);
		this.categorie= categorie;
		this.nbPage = nbPage;
	}
	
	//getteurs et setteurs

	public String getCategorie() {
		return this.categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	public int getNbPage() {
		
		return this.nbPage;
	}
	public void setNbPage(int nbPage) {
		//teste de verification si ne nombre de page est négatif
		if(nbPage>=0){
		this.nbPage = nbPage;
		};
	}
	public void lireDocument() {
		System.out.println("livre lu!!!");
	}

	
}
