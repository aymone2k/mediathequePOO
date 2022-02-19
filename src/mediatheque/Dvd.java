package mediatheque;

public class Dvd  extends Documents {
	private int duree;
	private String definition;
	
	public Dvd(int id, String titre, String auteur, String description, int anneeEdition, int duree, String definition) {
		super(id, titre, auteur, description, anneeEdition);
		this.duree = duree;
		this.definition =definition;
	}
	public void lireDocument() {
		System.out.println("dvd lu!!!");
	}
}

