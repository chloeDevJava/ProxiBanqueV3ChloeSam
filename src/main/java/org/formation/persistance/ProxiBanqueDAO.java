package org.formation.persistance;

import org.formation.entity.Client;

public interface ProxiBanqueDAO {

	public Client findClientById(Long idClient);
	
}
