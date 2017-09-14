/****************************************************************************** 
 *  Purpose: Factorization of user defined number
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/

package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(args[0]);
		System.out.print("The prime factorization of " + n + " is : 1 ");
		Utility.factorization(n);
	}

}
