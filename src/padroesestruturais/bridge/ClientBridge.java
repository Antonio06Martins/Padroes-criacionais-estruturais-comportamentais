package padroesestruturais.bridge;

import padroesestruturais.bridge.dao.UserMongoDao;
import padroesestruturais.bridge.dao.UserMysqlDao;
import padroesestruturais.bridge.dao.UserOracleDao;
import padroesestruturais.bridge.dao.UserPostgresDao;
import padroesestruturais.bridge.model.User;
import padroesestruturais.bridge.services.UserEJB;
import padroesestruturais.bridge.services.UserRest;
import padroesestruturais.bridge.services.UserService;
import padroesestruturais.bridge.services.UserSoap;

public class ClientBridge {

	public static void main(String[] args) {
		User user = new User("user", "user@email.com", "passwd");
		
		UserService userRestOracleService = new UserRest(new UserOracleDao());
		userRestOracleService.save(user);
		
		UserService userEJBMongoService = new UserEJB(new UserMongoDao());
		userEJBMongoService.save(user);
		
		UserService userSoapPostgresService = new UserSoap(new UserPostgresDao());
		userSoapPostgresService.save(user);
		
		//.......
		
		UserService userRestMysqlService = new UserRest(new UserMysqlDao());
		userRestMysqlService.save(user);
		
	}
}
