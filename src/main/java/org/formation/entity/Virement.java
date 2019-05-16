package org.formation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Virement {

	// Attributs
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idVirement;
	private Long montant;
	
	
	// Méthodes
	
	public void effectuerVirement() {
		// A IMPLEMENTER
	};
	
}
