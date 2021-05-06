package eMarket;

import java.util.Iterator;

import eMarket.business.concretes.LoginManager;
import eMarket.business.concretes.RegisterManager;
import eMarket.dataAccess.concretes.HibernateRegisterDao;
import eMarket.entities.concretes.Login;
import eMarket.entities.concretes.Register;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HibernateRegisterDao hiberDao = new HibernateRegisterDao();
		RegisterManager registerManager = new RegisterManager(hiberDao);
		LoginManager loginManager = new LoginManager(hiberDao);
		
		//1.kayıt
		Register register = new Register();
		register.setEmail("enes@gmail.com");
		register.setFirstName("Enes");
		register.setLastName("Dere");
		register.setPassword("123456");
		
		registerManager.add(register);
		
		//2.kayıt
		Register register2 = new Register();
		register2.setEmail("oguz@gmail.com");
		register2.setFirstName("Oguzhan");
		register2.setLastName("Dere");
		register2.setPassword("123456");
		
		registerManager.add(register2);
		/*
		for (Register reg : registerManager.getAll()) {
			System.out.println(reg.getEmail());
		}
		*/
		Login login = new Login();
		login.setEmail("oguz@gmail.com");
		login.setPassword("123456");
		
		loginManager.LoginSystem(login);
	}

}
