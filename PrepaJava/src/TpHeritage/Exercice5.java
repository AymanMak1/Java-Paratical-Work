package TpHeritage;

class A
{
	protected void m() 
	{
		System.out.println("A");
	}
}
class B extends A
{
	
}
class C extends B
{
	
}
class D extends A
{
	
}

public class Exercice5 {

	public static void main(String[] args) {	
		A a = new A(); //  Instantiation de A 
		B b = new B();// Instantiation de B
		C c = new C(); //  Instantiation de C 
		D d = new D(); // Instantiation de D 
		a.m(); //  Utilisation de sa methode m()
		b.m(); //  Utilisation de la methode herité m() de A
		c.m(); //  Utilisation de la methode herité de B qui est elle meme un methode herité de A 
		d.m(); //  Utilisation de la methode herité m() de A

	}

}
