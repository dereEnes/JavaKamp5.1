package eMarket.core.adapters;

import eMarket.entities.concretes.Register;
import eMarket.googleRegister.GoogleRegisterManager;

public class GoogleRegisterServiceAdapter implements ThirdRegisterService{
	public void getRegisterInformations() {
		GoogleRegisterManager manager = new GoogleRegisterManager();
		manager.getInfo();
		
	}
}
