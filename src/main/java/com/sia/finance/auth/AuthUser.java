package com.sia.finance.auth;

public class AuthUser {
	
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String username;
	private String email;
	private String parole;
	
	public AuthUser() {}
	
	public AuthUser(int id, String email, String parole) {
		this.id = id;
		this.email = email;
		this.parole = parole;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getParole() {
		return parole;
	}

	public void setParole(String parole) {
		this.parole = parole;
	}
	
	
}
