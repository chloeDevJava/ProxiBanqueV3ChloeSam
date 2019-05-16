package org.formation.entity;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.cxf.jaxrs.ext.xml.XMLName;


@Entity
@DiscriminatorValue("CompteCourant")
@XmlRootElement
public class CompteCourant extends Compte {

	// Attributs
	
	
	private static final Long AUT_DECOUVERT = 1000L;   // ATTENTION ON POURRA PAS MODIF ?
	
	// Constructeur
	
	public CompteCourant() {
		super();
	}
	
	public CompteCourant(Long soldeCompte, Date dateOuverture) {
		super(soldeCompte, dateOuverture);
	}

	// Getter
	public static Long getAutDecouvert() {
		return AUT_DECOUVERT;
	}

	
}
