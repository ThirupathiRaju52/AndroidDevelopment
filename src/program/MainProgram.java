package program;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MainProgram {
	
	private static DecimalFormat decimalFormat = new DecimalFormat("#.##");

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		char grade = '\0';
		
		double betterGrade;
		
		Scanner input1 = new Scanner(System.in);
		
		System.out.println("Enter Candidate Name: ");
		
		String userName = input1.nextLine();
		
		Scanner input2 = new Scanner(System.in);
		
		System.out.println("Enter grade percentage: ");
		
		double percentage = input2.nextDouble();	
		
		if(percentage>=80 && percentage<=100) {
			
			grade = 'A';
			
		} else if(percentage>=70 && percentage<=79.9){
			
			grade = 'B';
			
		} else if(percentage>=60 && percentage<=69.9){
			
			grade = 'C';
			
		} else if(percentage>=50 && percentage<59.9){
			
			grade = 'D';
		
		} else if (percentage<0 || percentage>100) { 
			
			grade = 'I';
			
		} else {
			
			grade = 'F';
			
		}
		
		switch(grade) {
		
			case 'A' :
				System.out.println("Excellent!" + userName + " You got A Grade.");
				break;
				
			case 'B' :
				System.out.println("Well done " + userName + " you got "+ grade + " Grade. ");
				betterGrade = (80-percentage);
				System.out.println("You need to get "+ decimalFormat.format(betterGrade) + "% extra to get A Grade");
				break;
				
			case 'C' :
				System.out.println("Well done " + userName + " you got "+ grade + " Grade. ");
				betterGrade = (70-percentage);
				System.out.println("You need to get "+ decimalFormat.format(betterGrade) + "% extra to get B Grade");
				break;
				
			case 'D' :
				System.out.println(userName + " You just passed with "+ grade + " Grade. ");
				betterGrade = (60-percentage);
				System.out.println("You need to get "+ decimalFormat.format(betterGrade) + "% extra to get C Grade");
				break;
				
			case 'F' :
				System.out.println("You just Failed. ");
				betterGrade = (50-percentage);
				System.out.println("You need to get "+ decimalFormat.format(betterGrade) + "% extra to get D Grade in-order to pass the course");
				break;
				
			default :
				System.out.println(userName+ ", Please enter your percentage from 0 to 100");
			}
		}
}
