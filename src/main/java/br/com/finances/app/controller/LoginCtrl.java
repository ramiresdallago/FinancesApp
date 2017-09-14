package br.com.finances.app.controller;


import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.finance.app.model.User;

@Path("/login")
public class LoginCtrl {

	@POST
	@Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
	public Response login(User user) {
		String output = user.toString();
		
		return Response.status(200).entity(output).build();

	}
	
}
