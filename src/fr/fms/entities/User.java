package fr.fms.entities;

public abstract class User {
	
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private RoleEnum role;
	
	
	public User(int id, String firstname, String lastname, String email, String password, RoleEnum role) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.role=role;
	}
	



	public User() {
	
	}
	
	

	public RoleEnum getRole() {
		return role;
	}




	public void setRole(RoleEnum role) {
		this.role = role;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", role=" + role + "]";
	}





	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
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
	
	public void connect() {
		
	}

}
