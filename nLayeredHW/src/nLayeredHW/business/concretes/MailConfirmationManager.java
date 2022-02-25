package nLayeredHW.business.concretes;
import java.util.ArrayList;
import java.util.List;
import nLayeredHW.business.abstracts.MailConfirmationService;

public class MailConfirmationManager implements MailConfirmationService{
	
	List<String> verifiedEmails = new ArrayList<String>();

	@Override
	public void sendMail(String email) {
		System.out.println("Confirmation message sent to email: " + email);
	}

	@Override
	public void verifyMail(String email) {
		verifiedEmails.add(email);
		System.out.println("Confirmation message has verified.");		
	}

	@Override
	public boolean checkIfEmailVerified(String email) {
		if(verifiedEmails.contains(email)) {
			System.out.println("This email has verified.");
			return true;
		}
		else 
			System.out.println("This email has not verified.");
		return false;
	}
	
}
