package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Scanner;

import classeFille.Client;
import classeMere.Promotion;


public class Main {
	public static void mainMenu() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("====== Menu Principal ======");
		System.out.println("1. Creer un nouveau client");
		System.out.println("2. Afficher tous les clients");
		System.out.println("3. Creer une nouvelle promotion");
		System.out.println("4. Afficher toutes les promotions");
		System.out.println("5. Quitter");
		
		try {
			System.out.println("Entrer un numero :");
			int choix = Integer.parseInt(reader.readLine());
			if (choix >= 1 && choix <= 5) {
				if (choix == 1) creerNouveauClient();
				if (choix == 3) creerPromotion();
				if (choix == 5) System.exit(0);
			}
		} catch (Exception e) {
			System.out.println("Entrez un nombre entre 1 et 5");
			mainMenu();
		}
	}
	
	public static Client creerNouveauClient() {
		try {
			// creation du buffer pour lire les donnees depuis la console
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			// demande d'informations à l'utilisateur
			System.out.println("Création d'un nouveau client !");
			
			System.out.println("Entrez l'identification du client : ");
			int identification = Integer.parseInt(reader.readLine());
			
			System.out.println("Entrez le nom du client : ");
			String nom = reader.readLine();
			
			System.out.println("Entrez le prenom du client : ");
			String prenom = reader.readLine();
			
			System.out.println("Entrez l'email du client : ");
			String email = reader.readLine();
			
			System.out.println("Entrez les preferences (ex: sans gluten, vegan) : ");
			String preferences = reader.readLine();
			
			System.out.println("Entrez l'annee de naissance : ");
			int annee = Integer.parseInt(reader.readLine());
			
			System.out.println("Entrez le mois de naissance : ");
			int mois = Integer.parseInt(reader.readLine());
			
			System.out.println("Entrez le jour de naissance : ");
			int jour = Integer.parseInt(reader.readLine());
			
			LocalDate dateDeNaissance = LocalDate.of(annee, mois, jour);
			
			Client nouveauClient = new Client(identification, nom, prenom, email, 0, "bronze", preferences);
			nouveauClient.setDateDeNaissance(dateDeNaissance);
			nouveauClient.setPreferences(preferences);
			Client.ajouterClient(nouveauClient);
		} catch (Exception e) {
			System.out.println("Une erreur s'est produite lors de la creation du client");
		}
		return null;	
	}
	
	public static void creerPromotion() {
		try {
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Creation d'une nouvelle promotion !");
			
			System.out.println("Entrez la description de la promotion : ");
			String description = scanner.nextLine();
			
			System.out.println("Entrez l'annee de debut de la promotion : ");
			int anneeDebut = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Entrez le mois de debut de la promotion : ");
			int moisDebut = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Entrez le jour de debut de la promotion : ");
			int jourDebut = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Entrez l'annee de fin de la promotion : ");
			int anneeFin = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Entrez le mois de fin de la promotion : ");
			int moisFin = Integer.parseInt(scanner.nextLine());
			
			System.out.println("Entrez le jour de fin de la promotion : ");
			int jourFin = Integer.parseInt(scanner.nextLine());
			
			LocalDate dateDebut = LocalDate.of(anneeDebut, moisDebut, jourDebut);
			LocalDate dateFin = LocalDate.of(anneeFin, moisFin, jourFin);
			
			Promotion nouvellePromotion = new Promotion(description,dateDebut,dateFin);
			nouvellePromotion.setDescription(description);
			nouvellePromotion.setDateDebut(dateDebut);
			nouvellePromotion.setDateFin(dateFin);
			Promotion.ajouterPromotion(nouvellePromotion);
		} catch (Exception e) {
			System.out.println("Erreur sur les informations saisies, veuillez reessayer");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Bienvenue !");
		mainMenu();
	}
}