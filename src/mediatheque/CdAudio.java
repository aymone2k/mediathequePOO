package mediatheque;

public class CdAudio extends Documents {
	private int duree;
	private int nbpiste;
	
	public CdAudio(int id, String titre, String auteur, String description, int anneeEdition, int duree, int nbPiste) {
		super(id, titre, auteur, description, anneeEdition);
		this.duree = duree;
		this.nbpiste = nbPiste;
	}

	public int getDuree() {
		return this.duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public int getNbpiste() {
		return this.nbpiste;
	}

	public void setNbpiste(int nbpiste) {
		this.nbpiste = nbpiste;
	}
	public void lireDocument() {
		System.out.println("CD lu!!!");
	}
	

}
