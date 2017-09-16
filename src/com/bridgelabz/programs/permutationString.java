/* ****************************************************************************
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *  @purpose Return all permutations of string entered.
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class permutationString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String : ");
		String string = scanner.next();
		int lengthOfString = string.length();
		Utility.permute(string, 0, lengthOfString - 1);
		scanner.close();
	}

}
