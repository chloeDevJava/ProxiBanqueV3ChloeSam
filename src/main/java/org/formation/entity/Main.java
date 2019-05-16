package org.formation.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.formation.persistance.DAOImplementation;
import org.formation.persistance.ProxiBanqueDAO;
import org.formation.service.ProxiBanqueService;
import org.formation.service.ServiceImplementation;

public class Main {

	public static void main(String[] args) {
		
		
		// Test JPA
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
//		EntityManager em1 = emf.createEntityManager();
//		EntityTransaction txn1 = em1.getTransaction();
//		
//		
//		
//		try {
//
//			txn1.begin();
//
//			Client c = new Client("GIBIGAYE", "Sam", "sam@gmail.com");
//			
//			em1.persist(c); // Créé une entité Client en BDD
//
//			txn1.commit();
//
//		} catch (Exception e) {
//			if (txn1 != null) {
//				txn1.rollback();
//			}
//			e.printStackTrace();
//		} finally {
//			if (em1 != null) {
//				em1.close();
//			}
//			if (emf != null) {
////				//emf.close();
//			}
//		}
		
		
		// Test partie DAO
		
//		ProxiBanqueDAO dao = new DAOImplementation();
//		
//		Client client = dao.findClientById(1L);
//		
//		System.out.println(client.getNomClient());
		
		
		// Test partie Service
		
		ProxiBanqueService service = new ServiceImplementation();
		
		Client client = service.getClientById(1L);
		
		System.out.println(client.getNomClient());
		
		
		
	}

}
