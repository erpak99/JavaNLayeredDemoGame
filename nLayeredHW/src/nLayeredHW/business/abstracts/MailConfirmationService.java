package nLayeredHW.business.abstracts;

public interface MailConfirmationService {
	void sendMail(String email);
	void verifyMail(String email);
	boolean checkIfEmailVerified(String email);
}
