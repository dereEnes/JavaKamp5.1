package eMarket.business.concretes;

import java.util.List;

import eMarket.business.abstracts.RegisterService;
import eMarket.core.utilities.Regex;
import eMarket.core.utilities.SendMail;
import eMarket.dataAccess.abstracts.RegisterDao;
import eMarket.entities.concretes.Register;

public class RegisterManager implements RegisterService{
	
	private RegisterDao registerDao;

	public RegisterManager(RegisterDao registerDao) {
		this.registerDao = registerDao;
	}

	@Override
	public void add(Register register) {
		
		if(register.getPassword().length()<6) {
			System.out.println("Parola uzunlu�u en az 6 karakter olmal�d�r!");
			return;
		}
		if(!Regex.isEmail(register.getEmail())) {
			System.out.println("L�tfen ge�erli bir email giriniz!");
			return;
		}
		if(register.getFirstName().length()<2 || register.getLastName().length()<2) {
			System.out.println("�sim ve soyisim uzunlu�u en az 2 karakter olmal�d�r!");
			return;
		}
		if(!checkForEmailIsUsed(register)) {
			System.out.println("Bu email adresi zaten kullan�lm��");
			return;
		}
		SendMail.send(register.getEmail());
		this.registerDao.add(register);
		
	}

	public boolean checkForEmailIsUsed(Register register) {
		List<Register> registers = this.registerDao.getAll();
		for (Register reg : registers) {
			if(reg.getEmail() == register.getEmail()) {
				return false;
			}
		}
		return true;
	}
	
	public void valideAccount(Register register) {
		register.setActivated(true);
	}
	
	@Override
	public void delete(Register register) {
		this.registerDao.delete(register);
		
	}

	@Override
	public void update(Register register) {
		this.registerDao.update(register);
		
	}

	@Override
	public List<Register> getAll() {
		return this.registerDao.getAll();
	}
	
	
}
