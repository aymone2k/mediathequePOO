package mediatheque;
import java.util.ArrayList;

public class Adherent {
	private int idAdh;
	private String nom;
	private String dateNaissance;
	private String tel;
	private ArrayList<Livre> livresEmprunt;
	
	public Adherent(int idAdh, String nom, String dateNaissance, String tel) {//livresEmprunt n'est pas à déclarer ici
		
		this.idAdh = idAdh;
		this.nom = nom;
		this.dateNaissance = dateNaissance;
		this.tel = tel;
		this.livresEmprunt = new ArrayList<>();
	}
//getteur setteurs
	public int getIdAdh() {
		return idAdh;
	}

	public void setIdAdh(int idAdh) {
		this.idAdh = idAdh;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public ArrayList<Livre> getLivresEmprunt() {
		return livresEmprunt;
	}

	public void setLivresEmprunt(ArrayList<Livre> livresEmprunt) {
		this.livresEmprunt = livresEmprunt;
	}
	
	
}
