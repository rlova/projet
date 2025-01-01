package classeFille;

import java.time.LocalDate;
import java.time.Month;

import classeMere.Promotion;

public class OffreAnniversaire extends Promotion {
	private int reduction;
	public OffreAnniversaire(String description, LocalDate dateDebut, LocalDate dateFin, int reduction) {
		super(description, dateDebut, dateFin);
		this.reduction = reduction;
	}
	
	public void appliquerOffre(Client client, LocalDate dateDuJour) {
		LocalDate date = client.getDateDeNaissance();
		if (date.equals(null)) {
			System.out.println("Date de naissance du client non rensaignee");
			return;
		}
		Month moisDuJour = dateDuJour.getMonth();
		Month moisAnniversaire = client.getDateDeNaissance().getMonth();
		int jour = dateDuJour.getDayOfMonth();
		int jourAnniversaire = client.getDateDeNaissance().getDayOfMonth();
		if ((moisDuJour.equals(moisAnniversaire)) && (jour == jourAnniversaire)) {
			System.out.println("Offre anniversaire appliquee pour "+client.getNom()+" "+client.getPrenom()+" ! Reduction : "+reduction+"%");
		}
	}
}
