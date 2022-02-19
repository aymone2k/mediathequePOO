package mediatheque;

public class BD  extends Documents {
	private int nbPage;
	
	public BD(int id, String titre, String auteur, String description, int anneeEdition, int nbPage) {
		super(id, titre, auteur, description, anneeEdition);
		this.nbPage = nbPage;
	}

	public int getNbPage() {
		return this.nbPage;
	}

	public void setNbPage(int nbPage) {
		this.nbPage = nbPage;
	}
	public void lireDocument() {
		System.out.println("Bd lu!!!");
	}
}
