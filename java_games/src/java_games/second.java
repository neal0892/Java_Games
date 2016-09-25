package java_games;

import java.util.Scanner;

public class second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please enter your age");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		if(x < 21)
			System.out.println("You have got a discount");
	
		System.out.println("Thanks for buying the ticket ");
	}

}
