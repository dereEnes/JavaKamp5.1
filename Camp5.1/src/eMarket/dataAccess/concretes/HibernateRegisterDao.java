package eMarket.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eMarket.dataAccess.abstracts.RegisterDao;
import eMarket.entities.concretes.Register;

public class HibernateRegisterDao implements RegisterDao{

	private List<Register> users;
	
	public HibernateRegisterDao() {
		this.users = new ArrayList<Register>();
		
	}
	@Override
	public void add(Register register) {
		System.out.println("Kullanýcý hibernate ile sisteme kayýt edildi.");
		this.users.add(register);
		
	}

	@Override
	public void delete(Register register) {
		System.out.println("Kullanýcý hibernate ile sistemden silindi.");
		this.users.remove(register);
	}

	@Override
	public void update(Register register) {
		System.out.println("Kullanýcý bilgileri hibernate ile güncellendi");
		
		
	}
	@Override
	public List<Register> getAll() {
		return this.users;
	}
	@Override
	public Register get(String email) {
		
		for (Register reg : this.getAll()) {
			System.out.println(reg.getEmail());
			if(reg.getEmail()==email) {
				System.out.println(reg.getEmail());
				return reg;
			}
		}
		return null;
	}
	
}
