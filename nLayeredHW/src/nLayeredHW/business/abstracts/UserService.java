package nLayeredHW.business.abstracts;

import nLayeredHW.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signIn(User user);
}
