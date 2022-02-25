package nLayeredHW.entities.concretes;

import nLayeredHW.entities.abstracts.Entity;

public class User implements Entity{
	private String firstName;
	private String lastname;
	private String email;
	private String password;
	
	public User() {
		
	}

	public User(String firstName, String lastname, String email, String password) {
		super();
		this.firstName = firstName;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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
