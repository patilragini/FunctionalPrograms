/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   01-09-2017
 *@purpose: accpets n number and find combination  such that 3 number sum equals to 0
 ******************************************************************************/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SumOfThree {
	static int flag = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter number of  elements to check their sum equals to 0 or not");
			int number = scanner.nextInt();
			int[] array = Utility.createArrayInt(number);
			Utility.sumOfThreeIsZero(array);
		} catch (InputMismatchException a) {
			System.out.print("Input type Problem!!!");
		}
		scanner.close();
	}
}
