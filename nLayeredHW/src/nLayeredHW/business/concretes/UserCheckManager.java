package nLayeredHW.business.concretes;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import nLayeredHW.business.abstracts.UserCheckService;
import nLayeredHW.entities.concretes.User;

public class UserCheckManager implements UserCheckService {
	
	List<String> emailList = new ArrayList<String>(); 

	@Override
	public boolean checkFirstName(User user) {
		if(user.getFirstName().length()<2) {
			System.out.println("First name should contain at least 2 characters...");
		return false;
		}
		else
			return true;
	}

	@Override
	public boolean checkLastName(User user) {
		if(user.getLastname().length()<2) {
			System.out.println("Last name should contain at least 2 characters...");
		return false;
		}
		else 
			return true;
	}

	
	@Override
	public boolean checkEmailFormat(User user) {
		String emailRegex =  "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
		Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		if(emailPattern.matcher(user.getEmail()).find() == false) {
			System.out.println("Wrong email format...");
			return false;
		}
		else 
			return true;
	}

	
	@Override
	public boolean checkPassword(User user) {
		if(user.getPassword().length()<6) {
			System.out.println("Password should contain at least 6 characters...");
		return false;
		}
		else
			return true;
	}

	@Override
	public boolean checkUsedEmail(User user) {
		if(emailList.contains(user.getEmail())) {
			System.out.println("This email address is already used...");
			return false;
		}
		else {
			emailList.add(user.getEmail());
			return true;
		}

	}

	@Override
	public boolean checkIfValidUser(User user) {
		if(checkFirstName(user) && checkLastName(user) && checkEmailFormat(user) &&
		   checkPassword(user) && checkUsedEmail(user)) {
			return true;
		}
		else
		return false;
	}
}