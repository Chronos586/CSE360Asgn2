package cse360assign2;

/**
 * Author: Jonathan Chance
 * Class ID: 85141
 * Assignment #: 2
 * Description: An Adding Machine contains
 * arithmetic operations for adding and subtracting
 * numbers from a given total. The history of
 * calculations is recorded and reported to the user.
 */

/**
 * AddingMachine class contains a finite
 * total where addition and subtraction
 * operations can be performed where the history
 * of all operations is recorded
 * 
 * @author Jonathan Chance
 * @version 1.0
 * @since 2019-10-07
 */
public class AddingMachine {

	private int total;
	private String instructionHistory;
	
	/**
	 * Default Constructor for adding machine
	 * with the total set to 0 and the history
	 * string set to the value of the total
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		instructionHistory = "" + total;
	}
	
	public int getTotal () {
		return this.total;
	}
	/**
	 * updates history string with the most
	 * recent arithmetic operation
	 * @param appendStr arithmetic operation to be
	 * added to history
	 */
	public void updateHistory(String appendStr){
		instructionHistory += appendStr;
	}
	/**
	 * Adds an input value to the total
	 * and records calculation into history
	 * @param value input to be added to the total
	 */
	public void add (int value) {
		this.total += value;
		String instruction = " + " + value;
		updateHistory(instruction);
	}
	/**
	 * Subtracts an input value from the total
	 * and records calculation into history
	 * @param value input to be subtracted from total
	 */
	public void subtract (int value) {
		this.total -= value;
		String instruction = " - " + value;
		updateHistory(instruction);
	}
	/** Return string containing history of all operations performed **/
	public String toString () {
		return this.instructionHistory;
	}
	
	/**
	 * Resets total to 0 and clears all
	 * history of calculations
	 */
	public void clear() {
		this.total = 0;
		this.instructionHistory = "" + this.total;
	}
}
