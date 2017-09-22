package br.com.finances.app.controller;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;
import br.com.finances.app.model.User;
import br.com.finances.app.service.LoginService;
import br.com.finances.app.utils.RandomString;

@Path("/login")
public class LoginCtrl {

	@POST
	@Path("/")
    @Consumes(MediaType.APPLICATION_JSON)
	public String login(String userString) {
		
		Gson gson = new Gson();
		User user = gson.fromJson(userString, User.class);
		LoginService loginService = new LoginService();
		RandomString a = null;
		try {
			a = loginService.authenticate(user);
			if(a == null) {
				return "Usuário ou senha inválildos!";
			}
		} catch (Exception e) {
			return "Este usuário ainda não foi cadastrado!";
		}
		
		return "Login efetuado com sucesso!";

	}
	
}
