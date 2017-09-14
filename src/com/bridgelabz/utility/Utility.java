package com.bridgelabz.utility;

import java.util.ArrayList;
import java.util.Scanner;

public class Utility {
	/**
	 * @author ragini
	 * @param String
	 *            name
	 * @return void
	 * 
	 */
	public static void printUsername(String name) {
		System.out.println("  Hello " + name + ",How are you?");

	}

	private static int headctr, tailctr;

	/**
	 * @author ragini
	 * @return void
	 * @param integer
	 *            number
	 */
	public static void flipCoin(int number) {
		// math.random() returns value between 0.0 and 1
		// so it is heads or tail 50% of time
		float head, tail;
		System.out.println("Number of flips=" + number);
		for (int i = 0; i < number; i++) {
			if (Math.random() < 0.5) {
				headctr = headctr + 1;
			} else {
				tailctr++;
			}
		}
		System.out.println("Heads percentage" + headctr);
		System.out.println("Tails percentage" + tailctr);
		head = headctr;
		head = (head / number) * 100;
		tail = (tailctr);
		tail = (tail / number) * 100;
		System.out.println("Heads percentage" + head + "%");
		System.out.println("Tails percentage" + tail + "%");
	}

	/**
	 * @param integer
	 *            year
	 * @return boolean
	 *         <p>
	 *         true -> if leap year
	 *         <p>
	 *         false -> not leap year
	 */
	public static boolean leap(int year) {
		if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * @param integer
	 *            number
	 * @return void
	 *         <p>
	 *         prints 2^n upto n times
	 */
	public static void powerOfTwo(int number) {
		for (int i = 0; i <= number; i++) {
			System.out.print(i);
			System.out.print("\t" + (int) (Math.pow(2, i)));
			System.out.println();
		}
	}

	/**
	 * @author ragini
	 * @param integer
	 *            num
	 * @return
	 */
	public static double harmonic(int num) {
		float i = 2;
		double mHarmonicNumber = 0;
		int mNthNumber = num;
		System.out.print(" 1/1.0 ");
		while (i <= mNthNumber) {
			System.out.print("+ ");
			mHarmonicNumber = mHarmonicNumber + (1 / i);
			System.out.print("1/" + i);
			i++;
		}
		return (mHarmonicNumber + 1);
	}

	/**
	 * @author ragini
	 * @param int
	 *            number
	 *            <p>
	 *            prints factor of number
	 */
	public static void factorization(int number) {
		for (int factor = 2; factor * factor <= number; factor++) {
			// if factor is a factor of n, repeatedly divide it out
			while (number % factor == 0) {
				System.out.print(factor + " ");
				number = number / factor;
			}
		}
		// if biggest factor occurs only once, number > 1
		if (number > 1)
			System.out.println(number);
		else
			System.out.println();
	}

	/**
	 * @param integer
	 *            stake
	 * @param integer
	 *            goal
	 * @param integer
	 *            trials
	 * @author ragini
	 *         <p>
	 *         prints percentage of game win,average bets
	 * 
	 */
	public static void gambler(int stake, int goal, int trials) {
		int bets = 0; // total number of bets made
		int wins = 0; // total number of games won
		int cash = 0;
		// repeat trials times
		for (int t = 0; t < trials; t++) {
			// do one gambler's ruin simulation
			cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5)
					cash++; // win $1
				else
					cash--; // lose $1
			}
			if (cash == goal)
				wins++; // did gambler go achieve desired goal?
		}
		// print results
		System.out.println(wins + " wins of " + trials);
		System.out.println("Percent of games won = " + 100.0 * wins / trials);
		System.out.println("Average  bets           = " + 1.0 * bets / trials);
	}

	/**
	 * @param integer
	 *            nRandoms
	 *            <p>
	 *            prints nRandoms unique numbers
	 * @author ragini
	 * @return void
	 */
	public static void getcpn(int nRandoms) {
		int randomCount = 1, randomNo, flag = 0, index = 1;
		int a[] = new int[nRandoms];
		a[0] = (int) (nRandoms * Math.random());
		while (index < nRandoms) {
			randomNo = (int) (Math.random() * nRandoms);
			randomCount++;
			for (int j = 0; j < index; j++) {
				if (a[j] == randomNo) {
					flag = 1;
				}
			}
			if (flag == 0) {
				a[index] = randomNo;
				index++;
			}
			flag = 0;
		}
		System.out.println(randomCount);
		for (int i : a) {
			System.out.println(i);
		}
	}

	// 2 C ARRAY CREATION GENERIC INT DOUBLE BOOLEAN
	/**
	 * @param row
	 * @param colomn
	 * @param choose
	 * 
	 * @return ArrayList T
	 *         <p>
	 *         If choose
	 *         <p>
	 *         1 Integer
	 *         <p>
	 *         2 Double
	 *         <p>
	 *         3 Boolean
	 *         <p>
	 *         Returns 2D array
	 */

	@SuppressWarnings("unchecked")
	public static <T> T arrayCreateGenericTwoDim(int row, int colomn, int choose) {
		ArrayList<ArrayList<T>> twoDArray = new ArrayList<ArrayList<T>>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < row; i++) {
			twoDArray.add(new ArrayList<T>());
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < colomn; j++)
				if (choose == 1)
					twoDArray.get(i).add((T) Integer.valueOf(scanner.nextInt()));
				else if (choose == 2) {
					System.out.println(j + "=");
					twoDArray.get(i).add((T) Double.valueOf(scanner.nextDouble()));
				} else if (choose == 3)
					twoDArray.get(i).add((T) Boolean.valueOf(scanner.nextBoolean()));
				else
					System.out.println("error");
		}
		scanner.close();
		return (T) twoDArray;

	}

	/**
	 * @param row
	 * @param coloumn
	 * @param generic
	 *            array
	 *            <p>
	 *            Display 2D array of generic type
	 */
	/// generic code of 2 d array display
	public static <generic> void arrayDisplayTwoDimGeneric(int row, int coloumn, ArrayList<ArrayList<generic>> array) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < coloumn; j++) {
				System.out.print("   " + array.get(i).get(j));
			}
			System.out.println();
		}
	}

	public static int flag = 0;

	/**
	 * @param integer
	 *            array
	 * @author ragini
	 *         <p>
	 *         prints combination of three numbers ==0
	 */
	public static void sumOfThreeIsZero(int array[]) {
		int number = array.length;
		for (int i = 0; i < number; i++) {
			for (int j = i; j < number; j++) {
				for (int k = i + 2; k < number; k++) {
					int sum = (array[i] + array[j] + array[k]);
					if (sum == 0) {
						System.out.println(" sum of (" + array[i] + ")+(" + array[j] + ")+(" + array[k] + ") is 0");
						flag++;
					}
				}
			}

		}
		if (flag > 0) {
			System.out.println("found!!! " + flag + " combinations");
		} else
			System.out.println("Not Found");

	}

	// create array of integer of size number and return integer array
	public static int[] createArrayInt(int number) {
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[number];
		System.out.println("Enter " + number + " values ");
		for (int i = 0; i < number; i++) {
			array[i] = scanner.nextInt();
		}
		scanner.close();
		return array;
	}

	/**
	 * @param x
	 *            double
	 * @param y
	 *            double
	 *            <p>
	 *            calculate and print distance between x point and y point
	 */
	public static void euclideanDistance(double x, double y) {
		double powx = (double) Math.pow(x, 2);
		// System.out.println("Power of x=" + powx);
		double powy = (double) Math.pow(y, 2);
		// System.out.print("Power of y=" + powy);
		/*
		 * Math.sqrt is mathematical function in lang package for taking square
		 * root
		 */
		double dist = (double) Math.sqrt(powx + powy); // distance formula.
		System.out.println("Distance from (" + x + "," + y + ") to (0,0)=" + dist);
		/*
		 * Math.pow is mathematical function in lang package for taking power of
		 * given number
		 */
	}

	/**
	 * @param no
	 *            parameter
	 * @return return long start Time
	 *
	 */

	public static long startStopWatch() {
		// TODO Auto-generated method stub
		startTime = System.currentTimeMillis();
		return startTime;
	}

	public static long startTime, stopTime;

	/**
	 * 
	 * @param startTime
	 * @return elapsed time i.e stopTime - startTime
	 */
	public static long elapsedTime(long startTime) {
		stopTime = System.currentTimeMillis();
		return ((stopTime - startTime)) / 1000;
	}

	/**
	 * 
	 * @param a
	 *            int
	 * @param b
	 *            int
	 * @param c
	 *            int
	 * @author ragini
	 *         <p>
	 *         finds the roots of the equation a*x*x + b*x + c.
	 */
	public static void quadratic(int a, int b, int c) {
		int delta = (b * b - 4 * a * c);
		double root1, root2;
		if (delta > 0) {
			System.out.println("roots are real and unequal");
			root1 = (-b + Math.sqrt(delta) / (2 * a));
			root2 = (-b - Math.sqrt(delta) / (2 * a));
			System.out.println("1st root is " + root1);
			System.out.println("2nd root is " + root2);
		} else if (delta == 0) {
			System.out.println("1st root are real and eqal");
			root1 = (-b + Math.sqrt(delta) / (2 * a));
			System.out.println("root:" + root1);
		} else {
			System.out.println("imaginary root!!!");
		}
	}

	/**
	 * 
	 * @param temp
	 *            double
	 * @param windspeed
	 *            double
	 *            <p>
	 *            Calculates the WindChill
	 */
	public static void windChill(double temp, double windspeed) {
		double a, b, c, windchil = 0; // double variables to store calculations
		if (temp <= 50 && (windspeed <= 120 && windspeed >= 3)) {
			a = (35.74 + 0.6215); // stores addition of double values
			b = ((0.4275 * temp) - 35.75);
			/*
			 * Math.pow is mathematical function in lang package for taking
			 * power of given number
			 */
			c = Math.pow(windspeed, 0.16); // (v,0.16) 0. is raise to power of v
											// and stored in v variable
			windchil = (a + (b * c));
		}
		System.out.println("windspeed =" + windspeed + "\ntemperature =" + temp + "\nWind Chill=" + windchil);
	}
}// @@@@@@@@@@@@@@@@@@@@@@@@
