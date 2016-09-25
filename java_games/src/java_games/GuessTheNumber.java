package java_games;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	int number;
	int max;
	Scanner scan = new Scanner(System.in);

	public GuessTheNumber() {
		Random rand = new Random();
		max = 100;
		number = Math.abs(rand.nextInt()) % (max + 1);
	}

	public void play() {

		while (true) {
			int move = scan.nextInt();
			if (move > number)
				System.out.println("The number is too large");
			else if (move < number)
				System.out.println("The number is too small");
			else {
				System.out.println("You got that bro");
				break;
			}
		}

	}

	public static void main(String[] args) {

		GuessTheNumber guess = new GuessTheNumber();
		System.out.println("Enter the number to get started ");
		guess.play();
		System.out.println("Intential change made to check learn git");
		System.out.println("Intential change made to check learn git!!");
	}

	// TODO Auto-generated method stub

}
