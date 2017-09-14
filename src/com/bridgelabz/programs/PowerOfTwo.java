/******************************************************************************
 *  
 *  Purpose: take argument n and print table of power of 2  less than equal to 2^n
 *  @author  ragini patil
 *  @version 1.0
 *  @since   12-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class PowerOfTwo {
	public static void main(String[] args) {
		int number = Integer.parseInt(args[0]);
		// overflows int if greater than 31
		if (number >= 0 && number < 31) {
			Utility.powerOfTwo(number);
		} else
			System.out.print("overflow");
	}
}