package cse360assign2;

public class AddingMachine {

	private int total;
	private String instructionHistory;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		instructionHistory = "" + total;
	}
	
	public int getTotal () {
		return this.total;
	}
	public void updateHistory(String appendStr){
		instructionHistory += appendStr;
	}
	public void add (int value) {
		this.total += value;
		String instruction = " + " + value;
		updateHistory(instruction);
	}
	
	public void subtract (int value) {
		this.total -= value;
		String instruction = " - " + value;
		updateHistory(instruction);
	}
		
	public String toString () {
		return this.instructionHistory;
	}

	public void clear() {
		this.total = 0;
		this.instructionHistory = "" + this.total;
	}
}
