package eMarket.business.concretes;

import eMarket.business.abstracts.RegisterService;
import eMarket.dataAccess.abstracts.RegisterDao;
import eMarket.entities.concretes.Login;
import eMarket.entities.concretes.Register;

public class LoginManager {

	private RegisterDao registerDao;

	public LoginManager(RegisterDao registerDao) {
		super();
		this.registerDao = registerDao;
	} 
	
	public void LoginSystem(Login login) {
		
		Register register = this.registerDao.get(login.getEmail());
		
		
		if(register == null) {
			System.out.println("B�yle bir mail adresi kay�tl� de�il!");
			return;
		}else if(login.getPassword() != register.getPassword()) {
			System.out.println("Parola hatal�!");
			return;
		}else {
			System.out.println("Giri� ba�ar�l�");
		}
		
		
	}
	
}
