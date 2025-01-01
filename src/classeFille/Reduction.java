package classeFille;

import java.time.LocalDate;

import classeMere.Promotion;

public class Reduction extends Promotion {
	private String statutRequis;
	public Reduction(String description, LocalDate dateDebut, LocalDate dateFin, String statutRequis) {
		super(description, dateDebut, dateFin);
		this.statutRequis = statutRequis;
	}
	
	public void appliquerReduction(Client client) {
		if (client.getStatutFidelite().equalsIgnoreCase(statutRequis)) {
			System.out.println("Reduction appliquee pour le client : "+client.getNom());
		} else {
			System.out.println("Reduction non applicable. Statut du client : "+statutRequis);
		}
	}	
}
