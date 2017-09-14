/****************************************************************************** 
 *  Purpose: take user name and print 
				hello <username > how are you?
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrintUsername {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter User name:");
		String name = scanner.next();
		Utility.printUsername(name);
		scanner.close();
	}
}