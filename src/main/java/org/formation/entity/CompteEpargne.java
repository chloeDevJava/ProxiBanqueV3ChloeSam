package org.formation.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;


@Entity
@DiscriminatorValue("CompteEpargne")
@XmlRootElement
public class CompteEpargne extends Compte {

	// Attributs
	
	private static final Double TAUX_REMUN = 0.03;
	
	// Constructeurs
	
	public CompteEpargne() {
		super();
	}
	
	public CompteEpargne(Long soldeCompte, Date dateOuverture) {
		super(soldeCompte, dateOuverture);
		// TODO Auto-generated constructor stub
	}
	
	// Getter
	
	public static Double getTauxRemun() {
		return TAUX_REMUN;
	}
	

}
