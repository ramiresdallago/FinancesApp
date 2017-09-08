package br.com.finances.app.services;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserService {

	@POST
	@Path("/resgister")
	public Response registerUser() {
		return null;
		
	}
	
	@PUT
	@Path("/edit")
	public Response editUser(@PathParam("idUser") String idUser) {
		return null;
		
	}
	
	@GET
	@Path("/find")
	public Response findUser(@PathParam("idUser") String idUser) {
		return null;
		
	}
	
	@DELETE
	@Path("/delete")
	public Response deleteUser(@PathParam("idUser") String idUser) {
		return null;
		
	}
}
