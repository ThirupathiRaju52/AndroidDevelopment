package program;

import java.util.Random;

public class Dice {

	private String diceType;
	private int numSides;
	private int sideUp;
	private Random random = new Random();
	private int NumberOfRolls = 0;

	// These are zero vaue constructor, we can't set and get the value
	Dice() {
		diceType = "d6";
		numSides = 6;
		sideUp = 1 + random.nextInt(6);
	}

	// 1 argument constructor for the number of sides
	Dice(int numSides) {
		this.numSides = numSides;
		this.diceType = "d" + numSides;
		this.sideUp = 1 + random.nextInt(numSides);
	}


	Dice(String diceType, int numSides) {
		this.diceType = diceType;
		this.numSides = numSides;
		this.sideUp = 1 + random.nextInt(numSides);
	}

	// Accessors
	public int getNumberOfSides() {
		return numSides;
	}

	public int getNumberOfRolls() {
		return NumberOfRolls;
	}

	public String getDiceType() {
		return diceType;
	}

	public int getSideUp() {
		return sideUp;
	}
	// Mutators

	public void setDiceType(String diceType) {
		this.diceType = diceType;
	}

	public void setNumberOfSides(int numSides) {
		this.numSides = numSides;
	}

	public void setSideUp(int value) {
		if (value < numSides && value > 0) {
			this.sideUp = value;
		} else {
			this.sideUp = 1 + random.nextInt(numSides);
		}
	}


	public int roll() {

		++NumberOfRolls;

		int val = (int) (Math.random() * 6) + 1;
		return val;

	}
}
