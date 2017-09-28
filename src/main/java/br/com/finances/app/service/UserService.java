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
		if(users != null && !users.isEmpty()) {
			for (User user : users) {
				if(userInsert.getEmail().equals(user.getEmail())) {
					return false;
				}
			}
			defineIdUser(userInsert);
		}else{
			userInsert.setId(1);
		}
		
		users.add(userInsert);
		return true;
		
	}

	private void defineIdUser(User userInsert) {
		User lastUser = null;
		for (User user : users) {
			lastUser = user;
		}
		userInsert.setId(lastUser.getId()+1);
	}

	public User findUserById(final Integer idUser) {
		for (User user : users) {
			if(user.getId() == idUser) {
				return user;
			}
		}
		return new User();
	}

	public boolean updateUser(User userUpdate) {
		for (User user : users) {
			if(user.getId() == userUpdate.getId()) {
				user = userUpdate;
				return true;
			}
		}
		return false;
	}
}
