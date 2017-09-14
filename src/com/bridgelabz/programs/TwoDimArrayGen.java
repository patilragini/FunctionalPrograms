/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   1-09-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TwoDimArrayGen {

	private static int coloumn = 0, row = 0;;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter row and columns ");
		try {
			row = scanner.nextInt();
			coloumn = scanner.nextInt();
			System.out.println("Choose the type of Array:");
			System.out.println("1: Integer");
			System.out.println("2: Double");
			System.out.println("3: Boolean");
			int typechoice = scanner.nextInt();
			System.out.println("enter data in matrix");
			Utility.arrayDisplayTwoDimGeneric(row, coloumn, Utility.arrayCreateGenericTwoDim(row, coloumn, typechoice));
			
		} catch (InputMismatchException a) {
			System.out.print("Input type Problem!!!");
		}
		System.out.println("END OF PROGRAM");
		scanner.close();
	}

}
