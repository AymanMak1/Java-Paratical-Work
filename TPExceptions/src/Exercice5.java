
public class Exercice5 {
	public static void main(String [] args) {
		try {
			MyIntStack pile = new MyIntStack (5);
			//pile.pop();
			pile.push(5);pile.push(18);pile.push(10);pile.push(7);pile.push(7);pile.push(7);pile.push(7);
			
		}catch(IllegalStateException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
