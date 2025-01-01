package classeMere;

import java.time.LocalDate;

public class Personne {
	private int identifiant;
	private String nom;
	private String prenom;
	private int age;
	private LocalDate dateDeNaissance;
	private String email;
		
	public Personne(int identifiant, String nom, String prenom, String email) {
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public void afficherProfil() {
		System.out.println("Profil de la personne : ");
		System.out.println("Identifiant : " + identifiant);
		System.out.println("Nom : " + nom);
		System.out.println("Prenom : " + prenom);
		System.out.println("Email : " + email);
	}
}
