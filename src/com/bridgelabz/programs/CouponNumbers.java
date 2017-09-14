/****************************************************************************** 
 *  Purpose: given N distinct Coupon Numbers, 
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import java.util.Scanner;
import com.bridgelabz.utility.Utility;

public class CouponNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// CouponNumbers couponNumbers = new CouponNumbers(); //object of class
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number of cupons: ");
		int number = scanner.nextInt();
		Utility.getcpn(number);
		scanner.close();

	}

}
