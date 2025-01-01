package classeMere;

import java.time.LocalDate; // pour manipuler des dates
import java.util.ArrayList;
import java.util.List;

public class Promotion {
	private int identifiant;
	private String description;
	private LocalDate dateDebut;
	private LocalDate dateFin;
	
	public Promotion(String description, LocalDate dateDebut, LocalDate dateFin) {
		this.description = description;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}
	
	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}
	
	private static List<Promotion> promotions = new ArrayList<>();
	
	public static void ajouterPromotion(Promotion promotion) {
		if (promotion!=null) {
			promotions.add(promotion);
			System.out.println("Promotion ajoutee : "+promotion.getDescription()+" du "+promotion.getDateDebut()+" au "+promotion.getDateFin());
		} else {
			System.out.println("Erreur. La promotion n'a pas pu etre ajoutee.");
		}
	}
	
	public static void afficherPromotion() {
		if (promotions.isEmpty()) {
			System.out.println("Aucune promotion disponible");
		} else {
			System.out.println("Liste des promotions : ");
			for (Promotion promo : promotions) {
				System.out.println("- Description : "+promo.getDescription()+", date de debut : "+promo.getDateDebut()+", date de fin : "+promo.getDateFin());
			}
		}
	}
	
	public void modifierPromotion(String nouvelleDescription, LocalDate nouvelleDateDebut, LocalDate nouvelleDateFin) {
		if (nouvelleDescription!=null) {
			this.description = nouvelleDescription;
		}
		if (nouvelleDateDebut!=null) {
			this.dateDebut = nouvelleDateDebut;
		}
		if (nouvelleDateFin!=null) {
			this.dateFin = nouvelleDateFin;
		}
		System.out.println("Promotion modifiee avec succes !");
	}
}
