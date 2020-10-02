package program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array needs to generate:: ");

		int size = sc.nextInt();

		int[] myArray = new int[size];

		for (int i = 0; i < myArray.length; i++) {

			myArray[i] = getRandom(1, 100);

		}

		sum(size, myArray);

		System.out.println(System.lineSeparator() + "Enter the value to Find that array: ");
		int findValue = sc.nextInt();

		arrayContains(myArray, findValue);

		System.out.println("Please choose the below methods: " + System.lineSeparator());

		System.out.println("    1 : Encryption " + System.lineSeparator());
		System.out.println("    2 : Decryption " + System.lineSeparator());

		final int method = sc.nextInt();

		if (method == 1) {

			System.out.println("Please enter the string needs to be encrypt:  " + System.lineSeparator());

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			String encryptString = reader.readLine();

			System.out.println("Started encrypting for String:  " + encryptString);

			int helpValue;

			System.out.println("Enter the value to help while encrypting the string");

			helpValue = Integer.parseInt(reader.readLine());

			encryptTheString(encryptString, helpValue);
		} else if (method == 2) {

			System.out.println("Please enter the string needs to be decrypt:  " + System.lineSeparator());

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

			String decryptString = reader.readLine();

			System.out.println("Started Decryption for String:  " + decryptString);

			int helpValue;

			System.out.println("Enter the value to help while decrypting the string");

			helpValue = Integer.parseInt(reader.readLine());

			decryptTheString(decryptString, helpValue);

		} else if (method != 1 || method != 2) {

			System.out.println("Invalid input: ");

			return;
		}

		System.out.println(System.lineSeparator() + "Successfully Complted LAB 2");

	}

	private static int sum(int size, int[] myArray) {

		System.out.println("Generated Random Numbers: " + Arrays.toString(myArray) + System.lineSeparator());

		int sum = 0;

		for (int i = 0; i < myArray.length; i++)

			sum += myArray[i];

		System.out.println("Sum of All Integers:" + sum);

		System.lineSeparator();

		return sum;

	}

	private static boolean arrayContains(final int[] array, final int v) {

		boolean result = false;

		for (int i : array) {
			if (i == v) {
				result = true;
				break;
			}
		}

		if (result) {

			System.out.println("Given Number: " + v + " Is Found" + System.lineSeparator());

		} else {

			System.out.println("Given Number " + v + " Is Not Found in that Array" + System.lineSeparator());

		}

		return result;
	}

	private static String encryptTheString(String string, int helpValue) {

		System.out.println("Before Encrypt: " + string + System.lineSeparator());
		System.lineSeparator();

		StringBuilder stringBuilder = new StringBuilder();

		char newChar;

		String encrptedString = null;

		char[] chArray = string.toCharArray();

		for (char ch : chArray) {

			newChar = (char) (ch * helpValue);

			encrptedString = encrptedString + newChar;
		}

		stringBuilder.append(encrptedString.substring(4));

		System.out.println("After Encrypt: " + stringBuilder.reverse() + System.lineSeparator());

		return stringBuilder.toString();
	}

	private static String decryptTheString(String string, int helpValue) {

		System.out.println("Before Decrypt: " + string + System.lineSeparator());

		StringBuilder stringBuilder = new StringBuilder();

		StringBuilder decryptString = stringBuilder.append(string);

		char newChar;

		String afterDecryptValue = null;

		char[] chArray = decryptString.reverse().toString().toCharArray();

		for (char ch : chArray) {

			newChar = (char) (ch / helpValue);

			afterDecryptValue = afterDecryptValue + newChar;
		}

		System.out.println("After Decrypt: " + afterDecryptValue.substring(4) + System.lineSeparator());

		return afterDecryptValue.substring(4);
	}

	public static int getRandom(int minimum, int maximum) {

		return ((int) (Math.random() * (maximum - minimum))) + minimum;
	}

}
