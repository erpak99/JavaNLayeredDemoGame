package nLayeredHW;

import nLayeredHW.business.abstracts.UserService;
import nLayeredHW.business.concretes.MailConfirmationManager;
import nLayeredHW.business.concretes.UserCheckManager;
import nLayeredHW.business.concretes.UserManager;
import nLayeredHW.dataAccess.concretes.HibernateUserDao;
import nLayeredHW.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setFirstName("Arda");
		user1.setLastname("Erpak");
		user1.setEmail("arda-erpak@hotmail.com");
		user1.setPassword("Arda123.");
		
		User user2 = new User();
		user2.setFirstName("Ali");
		user2.setLastname("Erpak");
		user2.setEmail("alianilerpakhotmail.com");
		user2.setPassword("ali789");
		
		User user3 = new User();
		user3.setFirstName("Nigar");
		user3.setLastname("Erpak");
		user3.setEmail("nigarerpak@hotmail.com");
		user3.setPassword("nigar111");
		
		UserService userService = new UserManager(new UserCheckManager(),new HibernateUserDao(),
								                  new MailConfirmationManager());
		userService.signUp(user1);
		//userService.signUp(user2);
		
		userService.signIn(user1);
		
		//userService.signUp(user3);
	}

}
