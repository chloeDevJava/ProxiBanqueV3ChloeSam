package org.formation.service;

import org.formation.entity.Client;
import org.formation.entity.Compte;

public interface ProxiBanqueService {

	// Client
	
	public Client getClientById(Long idClient);
	
	public void ajouterClient(Client client);
	
	
	// Compte
	
	public void ajouterCompte(Compte compte);

	public Compte trouverCompteParID(Long idCompte);
	
}
