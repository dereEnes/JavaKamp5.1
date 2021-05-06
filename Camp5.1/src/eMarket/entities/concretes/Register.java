package eMarket.entities.concretes;

import eMarket.entities.abstracts.Entity;

public class Register implements Entity{
	private String firstName;
	private String LastName;
	private String email;
	private String password;
	private boolean activated;
	
	public Register() {
		
	}
	
	public Register(String firstName, String lastName, String email, String password) {
		super();
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
		this.password = password;
		this.activated = false;
	}
	
	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
