package org.formation.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.xml.bind.annotation.XmlRootElement;



@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TypeClient", discriminatorType = DiscriminatorType.STRING)
@XmlRootElement
public class Client {
	
	// Attributs
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idClient;
	private String nomClient;
	private String prenomClient;
	private String emailClient;
	
	@OneToOne(cascade = {CascadeType.REMOVE}) 
	@JoinColumn(name = "adresse_id", unique = true)
	private Adresse adresseClient;
	
	private CompteCourant compteCourant;
	private CompteEpargne compteEpargne;
	
	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
	protected List<Compte> listComptes = new ArrayList<Compte>();
	
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	private Conseiller conseiller;
	
	//constructeur par défaut
	public Client() {
		super();
	}
	
	//Constructeur
	
	public Client(String nomClient, String prenomClient, String emailClient, Adresse adresseClient,
			CompteCourant compteCourant, CompteEpargne compteEpargne) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.emailClient = emailClient;
		this.adresseClient = adresseClient;
		this.compteCourant = compteCourant;
		this.compteEpargne = compteEpargne;
	}

	public Client(String nomClient, String prenomClient, String emailClient) {
		super();
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
		this.emailClient = emailClient;
	}

	// Getters et setters
	
	public Long getIdClient() {
		return idClient;
	}


	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public String getEmailClient() {
		return emailClient;
	}
	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	
	// Méthodes

	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", nomClient=" + nomClient + ", prenomClient=" + prenomClient
				+ ", emailClient=" + emailClient + "]";
	}
	
	
	

}
