package org.formation.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TypeCompte", discriminatorType = DiscriminatorType.STRING)
@XmlRootElement
public class Compte {

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCompte;
	private Long soldeCompte;
	private Date dateOuverture;
	
	
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "client_id")
	private Client client;
	
	// Constructeurs
	
	public Compte() {
		super();
	}
	
	public Compte(Long soldeCompte, Date dateOuverture) {
		super();
		this.soldeCompte = soldeCompte;
		this.dateOuverture = dateOuverture;
	}
	
	// Getters & Setters

	public Long getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(Long soldeCompte) {
		this.soldeCompte = soldeCompte;
	}

	public Date getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(Date dateOuverture) {
		this.dateOuverture = dateOuverture;
	}
	
	public Client getClient() {
		return client;
	}
	
	
	public void setClient(Client client) {
		this.client = client;
	}

	// Méthodes

	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", soldeCompte=" + soldeCompte + ", dateOuverture=" + dateOuverture
				+ ", client=" + client + "]";
	}
	
	
	

	
	
	
}
