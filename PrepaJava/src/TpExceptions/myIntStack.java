package TpExceptions;


public class myIntStack {
	private int[] contents; 
	private int tos; 
	
	// Top of the stack 
	
	public boolean push(int element) 
	{ 
		try
		{
			contents[++tos] = element;
			return true;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			int[] reserve = new int[tos+1];
			int i=0;
			for(int elt:contents)
			{
				reserve[i]=elt;
				i++;
			}
			reserve[i]= element;
			contents = reserve;
			return false;
		}
		
	}
	public myIntStack(int c) {
		this.contents= new int[c];
		this.tos = -1;
	}
	public int pop() 
	{ 
		try
		{
			return contents[tos--];
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Error : Array is empty");
			return 0;
		}
	}
	public int peek() 
	{
		return contents[tos]; 
	}  	
	public boolean isEmpty() 
	{ 
		return tos < 0; 
	}  
	public boolean isFull() 
	{ 
		return tos == contents.length - 1; 
	}
	public int[] getContents() {
		return contents;
	}

}
