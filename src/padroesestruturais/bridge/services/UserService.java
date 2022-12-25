package padroesestruturais.bridge.services;

import padroesestruturais.bridge.dao.UserDao;
import padroesestruturais.bridge.model.User;

public abstract class UserService {
	protected UserDao dao;

	public UserService(UserDao dao) {
		this.dao = dao;
	}
	
	public abstract void save(User user);
}
