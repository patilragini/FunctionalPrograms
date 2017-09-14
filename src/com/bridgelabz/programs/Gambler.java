/******************************************************************************
 *  Compilation:  javac Gambler.java
 *  Execution:    java Gambler stake goal N
 *  
 *  Purpose: 		 Simulates a gambler who start with $stake and place fair $1 bets
 * 					 until she goes broke or reach $goal. Keeps track of the number of
 * 					 times she wins and the number of bets she makes. Run the experiment N
 *  				 times, averages the results, and prints them out.
 *
 *  @author  ragini patil
 *  @version 1.0
 *  @since   12-08-2017
 *
 % java Gambler 50 250 1000
 *  178 wins of 1000
 *  Percent of games won = 17.8
 *  Avg # bets           = 10010.79
 *
 *  % java Gambler 50 150 1000
 *  337 wins of 1000
 *  Percent of games won = 33.7
 *  Avg # bets           = 4863.95
 * 
 *  % java Gambler 50 100 1000
 *  503 wins of 1000
 *  Percent of games won = 50.3
 *  Avg # bets           = 2464.59
 *
 ******************************************************************************/
package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Gambler {

	public static void main(String[] args) {
		int stake = Integer.parseInt(args[0]); // gambler's stating bankroll
		int goal = Integer.parseInt(args[1]); // gambler's desired bankroll
		int trials = Integer.parseInt(args[2]);
		Utility.gambler(stake, goal, trials);

	}

}
