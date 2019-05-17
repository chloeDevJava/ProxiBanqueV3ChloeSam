package org.formation.ws;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.formation.entity.Client;
import org.formation.service.ProxiBanqueService;
import org.formation.service.ServiceImplementation;


public class RestImplementation implements ProxiBanqueRest {
	private long currentId = 2L;
	Map<Long, Client> clients = new HashMap<Long, Client>();
	
	ProxiBanqueService service = new ServiceImplementation();
	
	public RestImplementation() {
		init();
	}
	
	final void init() {
		Client client = new Client("Spinnato", "Chloé", "chloe@mail.com");
		client.setIdClient(123L);
		clients.put(client.getIdClient(), client);
	}

//	@Override
//	public Client getClient(String idClient) {
//		Long longId = Long.valueOf(idClient);
//		Client client = clients.get(longId);
//
//		// Logger a mettre a la place syso
//		
//		return client;
//	}

	@Override
	public Response addClient(Client client) {
		client.setIdClient(++currentId);
		clients.put(client.getIdClient(), client);
		return  Response.ok(client).build() ;
	}

	
	// TEST de tout le fil : ws à bdd
	
	@Override
	public Client getClient(String idClient) {
	
		Long longId = Long.valueOf(idClient);
		
		Client client = service.getClientById(longId);
		
		// Logger a mettre a la place syso
		
		return client;
	}	
	
}
