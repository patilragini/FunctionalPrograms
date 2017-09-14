/****************************************************************************** 
 *  Purpose: Determines effective temperature & find wind chill
 *  @author  Ragini Patil
 *  @version 1.0
 *  @since   29-08-2017
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class WindChill {
	public static void main(String args[]) {
		double temp = Double.parseDouble(args[0]);
		double windspeed = Double.parseDouble(args[1]);
		Utility.windChill(temp, windspeed);
	}
}
