package org.formation.service;

import org.formation.entity.Client;
import org.formation.entity.Compte;
import org.formation.persistance.DAOImplementation;
import org.formation.persistance.ProxiBanqueDAO;

public class ServiceImplementation implements ProxiBanqueService {

	ProxiBanqueDAO dao = new DAOImplementation();
	
	// Client
	
	@Override
	public Client getClientById(Long idClient) {
		
		Client client = dao.findClientById(idClient);
		
		return client;
		
	}

	@Override
	public void ajouterClient(Client client) {
		if (client != null) {
			dao.save(client);
		}
	}

	// Compte
	
	@Override
	public void ajouterCompte(Compte compte) {
		if (compte != null) {
			dao.save(compte);
		}
	}

	@Override
	public Compte trouverCompteParID(Long idCompte) {
		return dao.findCptById(idCompte);
	}

}
