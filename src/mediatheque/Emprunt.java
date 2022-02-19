package mediatheque;

import java.time.LocalDate;

public class Emprunt {
	private LocalDate dateEmprunt;
	private Adherent empruntAdherent;
	private Livre empruntLivre;
	
	public Emprunt(LocalDate dateEmprunt, Adherent empruntAdherent, Livre empruntLivre) {
		this.dateEmprunt = dateEmprunt;
		this.empruntAdherent = empruntAdherent;
		this.empruntLivre = empruntLivre;
		
		//affectation de l'objet adhérent à emprunt pr associer a adhérent
		empruntAdherent.getLivresEmprunt().add(empruntLivre);
	
	
	}

	public LocalDate getDateEmprunt() {
		return dateEmprunt;
	}

	public void setDateEmprunt(LocalDate dateEmprunt) {
		this.dateEmprunt = dateEmprunt;
	}

	public Adherent getEmpruntAdherent() {
		return empruntAdherent;
	}

	public void setEmpruntAdherent(Adherent empruntAdherent) {
		this.empruntAdherent = empruntAdherent;
	}

	public Livre getEmpruntLivre() {
		return empruntLivre;
	}

	public void setEmpruntLivre(Livre empruntLivre) {
		this.empruntLivre = empruntLivre;
	}
	
}
