package TP3;

public class Author {
	private final String name;
	private String email;
	private final char gender;
	public Author(String name,String email,char gender ) {
		this.name=name;
		this.email = email;
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email=email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public char getGender() {
		return gender;
	}
	
	public String toString() {
		return "author-name: " + this.name + " {" + this.gender+ "} at " + this.email;
	}
			
	
}
