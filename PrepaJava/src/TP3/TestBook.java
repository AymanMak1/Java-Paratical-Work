package TP3;

public class TestBook {

	public static void main(String[] args) {
		Author anAuthor = new Author("MAKHOUKHI Ayman", "ayman.makhoukhi@gmail.com",'m');
		Book aBook = new Book("PHP DEV", anAuthor, 19.95, 1000);
		System.out.println(aBook);
		Book anotherBook = new Book("more Java for dummy", new Author("Tan Ah Teck", "ahteck@somewhere.com", 'm'), 29.95, 888);
		System.out.println(	aBook.getAuthor());
		System.out.println(	"Name of the author is " + aBook.getAuthor().getName() + " His email : " +  aBook.getAuthor().getEmail() + "\n");
		
		Book anotherBook2 = new Book("more mooooooore Java for dummy", new Author("EL WAHIDI EL ALAOUI Nada", "nada.ea28@somewhere.com", 'f'), 12.95, 90);
		System.out.println(	anotherBook2.getAuthorName());
		System.out.println(	anotherBook2.getAuthorGender());
		System.out.println(	anotherBook2.getAuthorEmail());

	}

}
