package service;

import dao.UserDao;
import model.User;

public class UserService {
	private UserDao userDao = new UserDao();
	
	public void registerUser(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		userDao.addUser(user);
	}
}
