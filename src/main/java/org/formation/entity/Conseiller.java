package org.formation.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Conseiller implements Audit {

	// Attributs
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idConseiller;
	private String nomConseiller;
	private String prenomConseiller;
	private String emailConseiller;
	
	@OneToMany(mappedBy = "conseiller", fetch = FetchType.LAZY)
	protected List<Client> listClients = new ArrayList<Client>();
	
	// Constructeurs
	
	public Conseiller() {
		super();
	}

	public Conseiller(String nomConseiller, String prenomConseiller, String emailConseiller) {
		super();
		this.nomConseiller = nomConseiller;
		this.prenomConseiller = prenomConseiller;
		this.emailConseiller = emailConseiller;
	}


	// Getters & Setters
	
	public String getNomConseiller() {
		return nomConseiller;
	}
	
	public void setNomConseiller(String nomConseiller) {
		this.nomConseiller = nomConseiller;
	}
	
	public String getPrenomConseiller() {
		return prenomConseiller;
	}
	
	public void setPrenomConseiller(String prenomConseiller) {
		this.prenomConseiller = prenomConseiller;
	}
	
	public String getEmailConseiller() {
		return emailConseiller;
	}
	
	public void setEmailConseiller(String emailConseiller) {
		this.emailConseiller = emailConseiller;
	}
	
	

	// Méthodes

	@Override
	public void auditerClients() {
		// A IMPLEMENTER
	}

	@Override
	public String toString() {
		return "Conseiller [idConseiller=" + idConseiller + ", nomConseiller=" + nomConseiller + ", prenomConseiller="
				+ prenomConseiller + ", emailConseiller=" + emailConseiller + "]";
	}
	

	
}
