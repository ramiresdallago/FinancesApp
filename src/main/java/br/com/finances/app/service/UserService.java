package br.com.finances.app.service;

import java.util.ArrayList;
import java.util.List;

import br.com.finances.app.model.User;

public class UserService {
	
	public UserService() {}
	
	private static List<User> users = new ArrayList<User>();
	
	public static List<User> getAllUsers() {
		if(users == null) {
			return new ArrayList<User>();
		}
		return users;
	}

	public boolean registerUser(User userInsert) {
		if(users != null) {
			for (User user : users) {
				if(userInsert.getEmail().equals(user.getEmail())) {
					return false;
				}
			}
		}
		users.add(userInsert);
		return true;
		
	}
}
