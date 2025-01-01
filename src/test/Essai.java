package test;

import java.time.LocalDate;
//import java.util.Scanner;

//import classeFille.Client;
import classeMere.Promotion;

public class Essai {
	public static void main(String[] args) {
		Main main = new Main();
		/*Client client = Main.creerNouveauClient();
		if (client!=null) {
			System.out.println("Creation client avec succès !");
			client.afficherClient();
		} else {
			System.out.println("Echec creation client");
		}*/
		//Client client = new Client(238,"Remano","Lova","lovaremano@gmail.com");
		//client.setPreferences("Sans gluten");
		//client.afficherClient();

		
		// creations promotions
		Promotion promotion1 = new Promotion("10% sur les produits BIO", LocalDate.of(2025, 01, 04), LocalDate.of(2025, 01, 10));
		Promotion promotion2 = new Promotion("20% sur les legumes", LocalDate.of(2024, 12, 25), LocalDate.of(2024, 12, 31));
		Promotion.ajouterPromotion(promotion1);
		Promotion.ajouterPromotion(promotion2);
		Promotion.afficherPromotion();
		//Reduction reduction = new Reduction("10% sur les produits BIO", LocalDate.of(2025, 01, 04), LocalDate.of(2025, 01, 10), "or");
		//reduction.appliquerReduction(client);
	}
}