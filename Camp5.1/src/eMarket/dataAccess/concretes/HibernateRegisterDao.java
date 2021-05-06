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
		System.out.println("Kullan�c� hibernate ile sisteme kay�t edildi.");
		this.users.add(register);
		
	}

	@Override
	public void delete(Register register) {
		System.out.println("Kullan�c� hibernate ile sistemden silindi.");
		this.users.remove(register);
	}

	@Override
	public void update(Register register) {
		System.out.println("Kullan�c� bilgileri hibernate ile g�ncellendi");
		
		
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
