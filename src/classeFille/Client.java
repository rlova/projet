package classeFille;

import java.util.ArrayList;
import java.util.List;

import classeMere.Personne;
import classeMere.Promotion;

public class Client extends Personne {
	private int pointsFidelite;
	private String statutFidelite;
	private String preferences;
	
	public Client(int identifiant, String nom, String prenom, String email, int pointsFidelite, String statutFidelite, String preferences) {
		super(identifiant, nom, prenom, email);
		this.pointsFidelite = pointsFidelite;
		this.statutFidelite = statutFidelite;
	}

	public int getPointsFidelite() {
		return pointsFidelite;
	}

	public String getPreferences() {
		return preferences;
	}

	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}

	public String getStatutFidelite() {
		return statutFidelite;
	}

	public void ajouterPoints(int montantAchat) {
		int pointsGagnes = montantAchat/10;
		pointsFidelite = pointsFidelite+pointsGagnes;
		mettreAjourStatut();
	}

	private void mettreAjourStatut() {
		if (pointsFidelite>=1000) {
			statutFidelite =  "or";
		} else if (pointsFidelite>=500) {
			statutFidelite = "argent";
		} else {
			statutFidelite = "bronze";
		}
	}
	
	public void afficherClient() {
		super.afficherProfil();
		System.out.println("Points de fidelite : "+pointsFidelite);
		System.out.println("Statut de fidelite : "+statutFidelite);
		System.out.println("Preferences : "+preferences);
	}
	
	private static List<Client> clients = new ArrayList<>();
	
	public static void ajouterClient(Client client) {
		if (client!=null) {
			clients.add(client);
			System.out.println("Promotion ajoutee : ");
		} else {
			System.out.println("Erreur. La promotion n'a pas pu etre ajoutee.");
		}
	}
}
