
/***************************************************************************
* Purpose : To create stop watch to count elapsed time of program
*
* @author   ragini
* @version  1.0
* @since    20-08-2017
****************************************************************************/
package com.bridgelabz.programs;

import java.util.Date;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class StopWatch {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("press y to start the watch :");
		char choice = scanner.next().charAt(0);
		if (choice == 'y') {
			long currentTime = Utility.startStopWatch();
			Date timestart = new Date();
		    System.out.println(timestart.toString());
			System.out.println("stop-watch stared!!!");
			System.out.println("Press( y )to  stop the stopwatch and get elapsed time between start and stop time");
			char ch = scanner.next().charAt(0);
			if (ch == 'y') {
				Date timestop = new Date();
				System.out.println("stop time "+timestop.toString());
				long elapsedTime = Utility.elapsedTime(currentTime);
				System.out.println("Elapsed time : " + elapsedTime + " mili seconds");
			}
			else System.out.println("Invalid choice!!!");
		} else
			System.out.println("Invalid choice!!!");
		scanner.close();
	}
}