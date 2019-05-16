package org.formation.persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.formation.entity.Client;

public class DAOImplementation implements ProxiBanqueDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	
	Client client = null;
	
	@Override
	public Client findClientById(Long idClient) {
		
		EntityManager em2 = emf.createEntityManager();
		EntityTransaction txn2 = em2.getTransaction();

		try {

			txn2.begin();

			client = em2.find(Client.class, idClient); // Cherche l'entité Client correspondant à l'id

			txn2.commit();

		} catch (Exception e) {
			if (txn2 != null) {
				txn2.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em2 != null) {
				em2.close();
			}
			if (emf != null) {
				// emf.close();
			}
		}

		return client;
		
	}

}
