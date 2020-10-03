package program;

public class MainProgram {

	final static int diceMaxValue = 6;

	public static void main(String[] args) {

		Dice dice1 = new Dice(diceMaxValue);
		Dice dice2 = new Dice(diceMaxValue);
		Dice dice3 = new Dice(diceMaxValue);
		Dice dice4 = new Dice(diceMaxValue);
		Dice dice5 = new Dice(diceMaxValue);


		int roll1 = dice1.roll();
		int roll2 = dice2.roll();
		int roll3 = dice3.roll();
		int roll4 = dice4.roll();
		int roll5 = dice5.roll();


		while (true) {

			if (roll1 == roll2 && roll1 == roll3 && roll1 == roll4 && roll1 == roll5) {
				System.out.println("Bingo Cold-Yahtzee happens: " + dice1.getNumberOfRolls() + " rolls");
				break;
			} else {
				System.out.printf("%d %d %d %d %d \n", roll1, roll2, roll3, roll4, roll4);
				roll1 = dice1.roll();
				roll2 = dice2.roll();
				roll3 = dice3.roll();
				roll4 = dice4.roll();
				roll5 = dice5.roll();
			}
		}
	}
	


}
