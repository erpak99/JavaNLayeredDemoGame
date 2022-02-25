package nLayeredHW.dataAccess.concretes;

import nLayeredHW.dataAccess.abstracts.UserDao;
import nLayeredHW.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		System.out.println("User is added to system with hibernate: " + user.getFirstName() + " " +user.getLastname());
	}

}
