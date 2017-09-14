package br.com.finances.app.service;

import java.util.List;

import br.com.finance.app.model.User;

public class UserService {
	
	private static List<User> users;
	
	public static List<User> getAllUsers() {
		return users;
	}
}
