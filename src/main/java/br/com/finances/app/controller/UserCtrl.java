package br.com.finances.app.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import br.com.finances.app.model.User;
import br.com.finances.app.service.UserService;

@Path("/user")
public class UserCtrl {
	
	private Gson gson = new Gson();
	private UserService userService = new UserService();
	
	@POST
	@Path("/register")
    @Consumes(MediaType.APPLICATION_JSON)
	public String registerUser(String jsonCadastro) {
		User user = gson.fromJson(jsonCadastro, User.class);
		
		if(userService.registerUser(user)) {
			return "Usuário cadastrado com sucesso!";
		}
		return "Esse e-mail já foi registrado!";
	}
	
	@GET
	@Path("/find/{idUser}")
	@Produces(MediaType.APPLICATION_JSON)
	public User findUser(@PathParam("idUser") Integer idUser) {
		
		return userService.findUserById(idUser);
	}
	
	@PUT
	@Path("/edit")
	public Response editUser(@PathParam("idUser") String idUser) {
		return null;
		
	}
	
	@DELETE
	@Path("/delete")
	public Response deleteUser(@PathParam("idUser") String idUser) {
		return null;
		
	}
}
