package eMarket.business.abstracts;

import java.util.List;

import eMarket.entities.concretes.Register;

public interface RegisterService {
	void add(Register register);
	void delete(Register register);
	void update(Register register);
	List<Register> getAll();
}
