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
	

}
