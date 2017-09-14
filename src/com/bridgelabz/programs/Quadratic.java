
/******************************************************************************
*  Purpose: Determines whether entered  Quadratic equation is imaginary and find roots of equation
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;
import java.util.Scanner;

public class Quadratic {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		System.out.println("Give values for quadratic equation a*x^2 +b*x +c");
		System.out.println("Enter a: b: c:");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		System.out.println("given quadratic eqn is:" + a + " x^2 +" + b + "x+" + c);
		Utility.quadratic(a, b, c);
		scanner.close();
	}
}