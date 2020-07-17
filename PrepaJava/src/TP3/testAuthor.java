package TP3;

public class testAuthor {

	public static void main(String[] args) {
		Author anAuthor = new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm');
		System.out.println(anAuthor); // appelle de toString()
		anAuthor.setEmail("paul@nowhere.com");
		System.out.println(anAuthor);
	}

}
