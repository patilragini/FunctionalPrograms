/******************************************************************************
  
 *  Purpose: Determines the Distance  entered points
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   08-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Distance {
	static int xpoint, ypoint;
	static double dist, p;

	public static void main(String args[]) {
		xpoint = Integer.parseInt(args[0]);
		ypoint = Integer.parseInt(args[1]);
		Utility.euclideanDistance(xpoint, ypoint);
	}
}