package org.formation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Adresse {

	// Attributs
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String ville;
	private String codePostal;
	
	@OneToOne(mappedBy = "adresseClient")
	private Client client;
	
	// Constructeurs
	
	public Adresse() {
	}
	
	public Adresse(String ville, String codePostal) {
		super();
		this.ville = ville;
		this.codePostal = codePostal;
	}

	// Getters & Setters
	
	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getCodePostal() {
		return codePostal;
	}


	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	// Méthodes

	@Override
	public String toString() {
		return "Adresse [ville=" + ville + ", codePostal=" + codePostal + "]";
	}
	
	
	
	
}
