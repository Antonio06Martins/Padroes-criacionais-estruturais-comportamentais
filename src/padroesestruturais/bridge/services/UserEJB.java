package padroesestruturais.bridge.services;

import padroesestruturais.bridge.dao.UserDao;
import padroesestruturais.bridge.model.User;

public class UserEJB extends UserService {

	public UserEJB(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through EJB Protocol!");
		dao.save(user);
	}
}
