package nLayeredHW.core;

import nLayeredHW.google.GoogleManager;

public class GoogleManagerAdapter implements GoogleService {

	@Override
	public void signGoogle(String message) {
		GoogleManager googleManager = new GoogleManager();
		googleManager.signWithGoogle(message);
	}

}
