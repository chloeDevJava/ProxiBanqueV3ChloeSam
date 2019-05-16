package org.formation.service;

import org.formation.entity.Client;
import org.formation.persistance.DAOImplementation;
import org.formation.persistance.ProxiBanqueDAO;

public class ServiceImplementation implements ProxiBanqueService {

	ProxiBanqueDAO dao = new DAOImplementation();
	
	@Override
	public Client getClientById(Long idClient) {
		
		Client client = dao.findClientById(idClient);
		
		return client;
		
	}

}
