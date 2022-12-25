package padroesestruturais.bridge.services;

import padroesestruturais.bridge.dao.UserDao;
import padroesestruturais.bridge.model.User;

public class UserRest extends UserService {

	public UserRest(UserDao dao) {
		super(dao);
	}

	@Override
	public void save(User user) {
		System.out.println("Starting a save operation through Rest Protocol!");
		dao.save(user);
	}
}
