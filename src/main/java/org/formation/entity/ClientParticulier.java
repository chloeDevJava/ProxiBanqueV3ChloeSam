package org.formation.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@DiscriminatorValue("Particulier")
@XmlRootElement
public class ClientParticulier extends Client {

	// Constructeur
	
	public ClientParticulier() {
		super();
	}
	
	public ClientParticulier(String nomClient, String prenomClient, String emailClient, Adresse adresseClient) {
		super(nomClient, prenomClient, emailClient, adresseClient);
	}

}
