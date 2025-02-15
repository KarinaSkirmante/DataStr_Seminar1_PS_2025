package datastr;

public class MyList {
	//mainīgie
	private char[] list;
	private final int DEFAULT_SIZE = 10;
	private int size = DEFAULT_SIZE;
	private int counter = 0;
	
	//bezargumenta konstruktors
	public MyList() {
		list = new char[size];
	}
	
	//argumenta konstruktors
	public MyList(int inputSize) {
		if(inputSize > 0) {
			size = inputSize;
		}
		
		list = new char[size];	
	}
	
	public boolean isFull()
	{
		//garais if-else
		/*if(counter == size) {
			return true;
		}
		else
		{
			return false;
		}
		*/
		
		//īso if-else
		//return (counter == size) ? true : false;
		
		
		//īsā forma priekš true/false
		return (counter == size);
		
	}
	
	public boolean isEmpty() {
		return (counter == 0);
	}
	
	public int howManyElements() {
		return counter;
	}
	
	
	
	
	
	
	
	

}
