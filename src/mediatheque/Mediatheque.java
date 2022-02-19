package mediatheque;

import java.time.LocalDate;
import java.util.ArrayList;

/*va contenir:
 * Livre / CdAudio / BD / dvd /jeux video;
 * Adherent
 * Emprunt
 */

public class Mediatheque {

	public static void main(String[] args) {
	Livre javaLivre = new Livre(111, "Java courses", "James C.", null, 2005, "techno", 22);
	
	Livre angularLivre = new Livre(222, "Angular 2","James Koissy","un cours sur angular", 1990, "Thechnologies",221);

	
	Livre cookLivre = new Livre(119, "cuisine", "2KALM", "mon 1er livre de cuisine pour les passionnées et les curieux", 2000, "maison", 900);

	
	System.out.println("jaja: " + javaLivre.getTitre()+ javaLivre.getAuteur()+ javaLivre.getNbPage() +javaLivre.getCategorie());
	
//stockage des livres dans ma collection livres
	ArrayList<Livre> livres = new ArrayList<>();
	
	livres.add(javaLivre);
	livres.add(angularLivre);
	livres.add(cookLivre);
	for(Livre l: livres) {
		System.out.println("livre: " +l.getTitre() +" " + l.getAuteur()+" "+ l.getCategorie() +" "+ l.getAnneeEdition()+ " " + l.getNbPage() +" "+ l.getDescription());
	}
	
//stokage des adhérents
	ArrayList<Adherent> adherents = new ArrayList<>();
	
	adherents.add(new Adherent(1 , "Jean", "22/01/1998", "08/09/87/35"));
	adherents.add(new Adherent(2 , "MOh", "22/01/1989", "08/09/87/00"));
	adherents.add(new Adherent(3 , "Jeanne", "22/01/2000", "08/09/45/35"));
	adherents.add(new Adherent(4 , "Jean-paul", "15/01/1998", "12/09/87/35"));
	
	for(Adherent Ad: adherents) {
		System.out.println("adherent N°"+ Ad.getIdAdh()+" : " + Ad.getNom() +" "+ Ad.getDateNaissance() +" "+Ad.getTel());
	}
	
//stockage des emprunts
	ArrayList<Emprunt> emprunts = new ArrayList<>();
	Emprunt emprunt1 = new Emprunt(LocalDate.now(), adherents.get(0), angularLivre);
	Emprunt emprunt2 = new Emprunt(LocalDate.now(), adherents.get(2), cookLivre);
	Emprunt emprunt3 = new Emprunt(LocalDate.now(), adherents.get(1), javaLivre);
	
	emprunts.add(emprunt1);
	emprunts.add(emprunt2);
	emprunts.add(emprunt3);
	
	for(Emprunt E: emprunts) {
		System.out.println("emprunts:"+"le: " + E.getDateEmprunt() +" Mr/Mme "+ E.getEmpruntAdherent().getNom() +" a emprunté "+ E.getEmpruntLivre().getTitre()+" de "+E.getEmpruntLivre().getAuteur());
	System.out.println("infos adherents: "+E.getEmpruntAdherent().getNom() + " nb livre: "+E.getEmpruntAdherent().getLivresEmprunt().size()+"livres");
	}
	
//exos pour expliquer les références:
	//livre4 et angularLivre pointe vers le meme livre stocké
	Livre livre4 = angularLivre;
	
	System.out.println(livre4.getTitre());
	//modif de angularLivre modifie aussi livre4
	angularLivre.setTitre("coucou");
	System.out.println(livre4.getTitre());
	
//exples héritage:
	
	CdAudio disque1 = new CdAudio(109, "cloclo dance", "cloclo","vidéo de cloclo dansant", 1999, 180, 10 );
	System.out.println(disque1.getAnneeEdition() +" "+ disque1.getAuteur()+ " "+ disque1.getDescription() +" "+disque1.getDuree());
	
	CdAudio disque2 = new CdAudio(90, "brid","fun", null, 20, 50, 900);
	System.out.println(disque2.getAnneeEdition() +" "+ disque2.getAuteur()+ " "+ disque2.getDescription() +" "+disque2.getDuree());
	
	
	ArrayList<Documents> documents = new ArrayList<>();
	documents.add(disque1);
	documents.add(disque2);
	documents.add(cookLivre);
	documents.add(livre4);
	documents.add(javaLivre);
	documents.add(angularLivre);
	
	for (Documents doc: documents) {
		System.out.println("documents: " +doc.getAnneeEdition() +" "+ doc.getAuteur()+ " "+ doc.getDescription() +" "+doc.getId());
	doc.afficherTitre();
	doc.lireDocument();
	}
	

	
	}
}
