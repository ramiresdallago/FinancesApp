package br.com.finances.app.service;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import br.com.finances.app.model.User;
import br.com.finances.app.utils.RandomString;

public class LoginService {
	
	public RandomString authenticate(User user) throws Exception {
		
		if(UserService.getAllUsers() == null || UserService.getAllUsers().isEmpty()) {
			throw new Exception("Usuário não registrado!");
		}
		
		if(loginValido(user)) {
			return generateToken();
		}
		
		return null;
	}
	
	private boolean loginValido(User userLogin) {
		List<User> users = UserService.getAllUsers();
		
		for (User user : users) {
			if(user.getEmail().equals(userLogin.getEmail()) && user.getPassword().equals(userLogin.getPassword()) ) {
				return true;
			}
		}
		return false;
		
	}
	
	private RandomString generateToken() {
		RandomString gen = new RandomString(8, ThreadLocalRandom.current());
		
		return gen;
	}
}
