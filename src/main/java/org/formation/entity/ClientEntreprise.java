package org.formation.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@DiscriminatorValue("Entreprise")
@XmlRootElement
public class ClientEntreprise extends Client {

	// Attributs
	
	private String raisonSociale;
	
	// Constructeur
	
	public ClientEntreprise() {
		super();
	}
	
	public ClientEntreprise(String nomClient, String prenomClient, String emailClient, Adresse adresseClient, String raisonSociale) {
		super(nomClient, prenomClient, emailClient, adresseClient);
		this.raisonSociale = raisonSociale;
	}


	// Getters & Setters
	
	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	
	// Méthodes

	@Override
	public String toString() {
		return "ClientEntreprise [raisonSociale=" + raisonSociale + "]";
	}
	
	
}
