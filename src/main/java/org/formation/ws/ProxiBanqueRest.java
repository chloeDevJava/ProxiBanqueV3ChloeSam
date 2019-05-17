package org.formation.ws;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.formation.entity.*;

//import org.formation.entity.Client;

@Produces({"application/xml","application/json" })
public interface ProxiBanqueRest { 

	@GET
	@Path("/clients/{idClient}")
	Client getClient(@PathParam("idClient") String idClient);

	@POST
	@Path("/clients/")
	Response addClient(Client client);
	
	
}
