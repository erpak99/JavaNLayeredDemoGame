package nLayeredHW.business.abstracts;

import nLayeredHW.entities.concretes.User;

public interface UserCheckService {
	boolean checkFirstName(User user);
	boolean checkLastName(User user);
	boolean checkEmailFormat(User user);
	boolean checkPassword(User user);
	boolean checkUsedEmail(User user);
	boolean checkIfValidUser(User user);
}
