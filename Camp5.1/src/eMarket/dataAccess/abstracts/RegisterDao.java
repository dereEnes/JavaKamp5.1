package eMarket.dataAccess.abstracts;

import java.util.List;

import eMarket.entities.concretes.Register;

public interface RegisterDao {
	void add(Register register);
	void delete(Register register);
	void update(Register register);
	List<Register> getAll();
	Register get(String email);
	
}
