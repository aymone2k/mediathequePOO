package mediatheque;

public class JeuxVideo  extends Documents {
	private int ageMin;
	
	public JeuxVideo(int id, String titre, String auteur, String description, int anneeEdition, int ageMin) {
		super(id, titre, auteur, description, anneeEdition);
		this.ageMin = ageMin;
	}

	public int getAgeMin() {
		return this.ageMin;
	}

	public void setAgeMin(int ageMin) {
		this.ageMin = ageMin;
	}
	public void lireDocument() {
		System.out.println("doc lu!!!");
	}

}

