package br.com.finances.app.services;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/spent")
public class SpentService {

	@POST
	@Path("/register")
	public Response registerSpent() {
		return null;
	}
	
	@PUT
	@Path("/edit")
	public Response editSpent(@PathParam("idSpent") String idSpent) {
		return null;
		
	}
	
	@GET
	@Path("/findOne")
	public Response findSpent(@PathParam("idSpent") String idSpent) {
		return null;
		
	}
	
	@GET
	@Path("/findAll")
	public Response findAllSpents() {
		return null;
		
	}
	
	@DELETE
	@Path("/delete")
	public Response deleteSpent(@PathParam("idSpent") String idSpent) {
		return null;
		
	}
}
