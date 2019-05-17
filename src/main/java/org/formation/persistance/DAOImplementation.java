package org.formation.persistance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.formation.entity.Client;
import org.formation.entity.Compte;

public class DAOImplementation implements ProxiBanqueDAO {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
	
	Client client = null;
	
	// Récupère client par son id
	
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

	// Enregistre un nouveau client
	
	@Override
	public void save(Client client) {

		EntityManager em1 = emf.createEntityManager();
		EntityTransaction txn1 = em1.getTransaction();

		try {

			txn1.begin();

			em1.persist(client); // Créé une entité Client en BDD

			txn1.commit();

		} catch (Exception e) {
			if (txn1 != null) {
				txn1.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em1 != null) {
				em1.close();
			}
			if (emf != null) {
//				//emf.close();
			}
		}
		
	}

	@Override
	public void save(Compte compte) {
		
		EntityManager em7 = emf.createEntityManager();
		EntityTransaction txn7 = em7.getTransaction();

		try {

			txn7.begin();

			em7.persist(compte); // Créé une entité Compte en BDD

			txn7.commit();

		} catch (Exception e) {
			if (txn7 != null) {
				txn7.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em7 != null) {
				em7.close();
			}
			if (emf != null) {
//				//emf.close();
			}
		}
		
	}

	Compte compte = null;
	
	@Override
	public Compte findCptById(Long idCompte) {
		
		EntityManager em8 = emf.createEntityManager();
		EntityTransaction txn8 = em8.getTransaction();

		try {

			txn8.begin();

			compte = em8.find(Compte.class, idCompte); // Cherche l'entité Compte correspondant à l'id

			txn8.commit();

		} catch (Exception e) {
			if (txn8 != null) {
				txn8.rollback();
			}
			e.printStackTrace();
		} finally {
			if (em8 != null) {
				em8.close();
			}
			if (emf != null) {
				// emf.close();
			}
		}

		return compte;
	}

}
