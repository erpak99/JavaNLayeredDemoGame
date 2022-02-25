package nLayeredHW.business.concretes;

import nLayeredHW.business.abstracts.MailConfirmationService;
import nLayeredHW.business.abstracts.UserCheckService;
import nLayeredHW.business.abstracts.UserService;
import nLayeredHW.dataAccess.abstracts.UserDao;
import nLayeredHW.entities.concretes.User;

public class UserManager implements UserService {
	
	UserCheckService userCheckService;
	UserDao userDao;
	MailConfirmationService mailConfirmationService;
	
	public UserManager(UserCheckService userCheckService, UserDao userDao,
					   MailConfirmationService mailConfirmationService) {
		this.userCheckService = userCheckService;
		this.userDao=userDao;
		this.mailConfirmationService=mailConfirmationService;
	}

	
	@Override
	public void signUp(User user) {
		if(userCheckService.checkIfValidUser(user)==true) {
			System.out.println("New user signed up to system: " + user.getFirstName() +" " + user.getLastname());
			userDao.add(user);
			mailConfirmationService.sendMail(user.getEmail());
		}
		else
			System.out.println("Check your info...");
	}

	@Override
	public void signIn(User user) {
		mailConfirmationService.verifyMail(user.getEmail());
		if(userCheckService.checkIfValidUser(user)==true) {
			if(mailConfirmationService.checkIfEmailVerified(user.getEmail())==true) {
				System.out.println("User " +user.getFirstName() +" " + user.getLastname() + " signed in...");
			}
		}
		else if(mailConfirmationService.checkIfEmailVerified(user.getEmail())==false) {
			mailConfirmationService.verifyMail(user.getEmail());
		}
		
	}
}
