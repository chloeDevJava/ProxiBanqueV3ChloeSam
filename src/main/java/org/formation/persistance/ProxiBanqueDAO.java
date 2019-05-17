package org.formation.persistance;

import org.formation.entity.Client;
import org.formation.entity.Compte;

public interface ProxiBanqueDAO {

	// Client
	
	public Client findClientById(Long idClient);

	public void save(Client client);

	// Compte
	
	public void save(Compte compte);

	public Compte findCptById(Long idCompte);
	
}
