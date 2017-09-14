/****************************************************************************** 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.InputMismatchException;

import com.bridgelabz.utility.Utility;

public class LeapYear {
	static int year;
	public static void main(String[] args) {
		try{
			year = Integer.parseInt(args[0]);
		}
		catch (InputMismatchException a){
		    System.out.print("Input type Problem!!!");
		}
		if (Utility.leap(year)) {
			System.out.println("leap year" + year);
		} else
			System.out.println("not a leap year"+year);
	}

}
