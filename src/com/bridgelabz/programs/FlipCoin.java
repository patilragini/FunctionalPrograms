/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FlipCoin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char choice;
		int number = 0;
		do {
			System.out.println("Enter number of flips");
			try {
				number = scanner.nextInt();
			} catch (InputMismatchException a) {
				System.out.print("Input type Problem!!!");
			}
			Utility.flipCoin(number);
			System.out.println("Enter your choice to continue  y/n :");
			choice = scanner.next().charAt(0);

		} while (choice == 'y' || choice == 'Y');
		System.out.println("Stop!!!");
		scanner.close();
	}

}
