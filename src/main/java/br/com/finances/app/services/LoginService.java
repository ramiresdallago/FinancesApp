package br.com.finances.app.services;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/login")
public class LoginService {

	@POST
	@Path("/")
	public Response login(@PathParam("userName") String userName, @PathParam("password") String password) {
		return null;
		
	}
	
}
