
public class MyIntStack {
	private int[] contents; 
	private int tos; // Top of the stack 
	
	public MyIntStack(int capacity) {
		contents = new int[capacity];
		tos = -1; 
	} 
	
	/*
	public void push(int element) { 
		if(isFull()) throw new IllegalStateException("Pile pleine");
			contents[++tos] = element;
	} 
	*/
	
	public boolean push(int element) { 
		boolean test =true;
		if(isFull()) throw new IllegalStateException("Pile Pleine");
			contents[++tos] = element;
			return test;
	} 
	
	/*
	public void push(int element) {
		if(isFull()) {
			int [] temp = contents;
			contents = new int[tos];
			for(int i=0; i<tos;i++) {
				contents[i]= temp[i];
				contents[tos++]=element;
			}
		}
		else {
			contents[++tos]=element;
		}
	}
	*/
	public int pop() { 
		if(isEmpty()) throw new IllegalStateException("Pile vide");
		return contents[tos--]; 
	} 
	
	public int peek() {
		return contents[tos];
	} 
	
	public boolean isEmpty() {
		return tos < 0; 
	} 
	
	public boolean isFull() { 
		return tos == contents.length - 1; 
	}
}
