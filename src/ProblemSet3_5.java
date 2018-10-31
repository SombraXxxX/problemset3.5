/**
 * INSTRUCTIONS.
 * 
 * The following exercises are, perhaps, more mathematically inclined than previous
 * problem sets. While they might be challenging, they are certainly doable.
 * 
 * You can (and should!) solve each of them using only the operators, conditional control
 * structures, and iterative control structures we've covered. You are not permitted to use
 * recursive code in your solutions.
 * 
 * Please be mindful of the expected outputs, as your code will be tested against that
 * directly. If you're unsure, please ask for clarification.
 * 
 * This problem set is worth 25 points and is due no later than 11:59pm on October 28, 2018.
 */

public class ProblemSet3_5 {
	
	public static void main(String[] args) {
		ProblemSet3_5 ps = new ProblemSet3_5();
		
		// test your solutions here
		
		ps.testPrimes();
		ps.testLeapYears();
		ps.testPalindromicNumbers();
		ps.testFibonacci();
		ps.testMultiples();

	}
	
	/**
	 * How many prime numbers are there between @start and @end, where @start and @end
	 * are positive integers in the range [1, @Integer.MAX_VALUE]?
	 * 
	 * Print your solution in the following formats: "There is X prime number."
	 *                                               "There are X prime numbers."
	 * 
	 * @param start
	 * @param end
	 */
	
	public void primes(int start, int end) {
		int count = 0;
		for(int i = start; i <= end; i++) {
			boolean isPrime = true;
			int m;
			if (i==1 || i == 0) {
				isPrime = false;
				
			}
			for(int j = 2;j <= p/2; j++)
			{
		           m= i % j;
		           if(m == 0) {
		        	   isPrime = false;
		        	   break;
		           }
			}
			if(isPrime) {
				count++;
			}

		}
		if(count == 1) {
			System.out.println("There is 1 prime number.");
		}
		else if (count != 1) {
		   System.out.println("There are " + count + " prime numbers.");

		}
		}
		System.out.println("There is " + prime + " prime numbers.");
	}
}
	
	/**
	 * What are the next @count leap years?
	 * 
	 * Print your solution in the following formats: "The next leap year is X."
	 *                                               "The next 2 leap years are X and Y."
	 *                                               "THe next N leap years are A, ..., X, Y, and Z."
	 * 
	 * @param count
	 */
	
	public void leapYears(int count) {	
	int lastLeap = 2016;
		if (count < 0 || count == 0) {
			System.out.println("I don't know how to compute the next " + count + " leap years...");
		}
		else {
			System.out.print("The next ");
					if (count == 1) {
						System.out.print("leap year is ");
					}
					else if (count >= 2) {
						System.out.print(count + " leap years are ");
					}
					for (int i = 1; i <= count; i++) {
						if (i != count) {
							if ((lastLeap + (4 * i)) % 400 == 0) {
								System.out.print((lastLeap + (4 * i)) + ", ");
							}
							else if ((lastLeap + (4 * i)) % 400 != 0 && (lastLeap + (4 * i)) % 100 == 0) {
								System.out.print((lastLeap + (4 * (i + 1))) + ", ");
								i++;
								count++;
							}
							else if (count == 2) {
								System.out.print((lastLeap + (4 * i)) + " ");
							}
							else {
								System.out.print((lastLeap + (4 * i)) + ", ");
							}
						}
						else if (i == count) {
							if (count != 1) {
								System.out.println("and " + (lastLeap + (4 * i)) + ".");
							}
							else if (count == 1) {
								System.out.println((lastLeap + (4 * i)) + ".");
							}
						}
					}
		}

	}
	
	/**
	 * Is @number a palindromic number?
	 * 
	 * Print your solution in the following formats: "X is a palindromic number."
	 *                                               "X is not a palindromic number."
	 *                                               
	 * @param number
	 */
	
	public void palindromicNumbers(int number) {
		int e = 0;
		int all = 0;
		int half = number;
		
		while (number > 0) {
			e = number % 10;   
			all = (all * 10) + even;   
			number = number / 10;
			}   
		 
		if (half == all) {
			System.out.println(half + " is a palindromic number.");
		}
		else {
			System.out.println(half + " is not a palindromic number.");
		}
	
	}
	
	/**
	 * What is the @nth Fibonacci number, where @n is a positive integer?
	 * 
	 * Print your solution in the following formats: "The 21st Fibonacci number is X."
	 *                                               "The 22nd Fibonacci number is X."
	 *                                               "The 23rd Fibonacci number is X."
	 *                                               "The 24th Fibonacci number is X."
	 *                                               
	 * @param n
	 */
	
	public void fibonacci(int n) {
		int number = n % 10;
		int first = 0;
		int second = 1;
		int sum = 0;
		for (int x = 1; x < n; x++)
		{
			sum = first + second;
			first = second;
			second = sum;
		}
		if (number == 1)
		{
			System.out.println("The " + n + "st " + "Fibonacci number is " + sum);
		}
		else if (number == 2)
		{
			System.out.println("The " + n + "nd " + "Fibonacci number is " + sum);
		}
		else if (number == 3)
		{
			System.out.println("The " + n + "rd " + "Fibonacci number is " + sum);
		}
		else
		{
			System.out.println("The " + n + "th " + "Fibonacci number is " + sum +".");
		}

	}
	
	/**
	 * What is the sum of all multiples of @x and @y less than @limit, where @x, @y, and
	 * @limit are positive integers?
	 * 
	 * Print your solution in the following format: "The sum of all multiples of X and Y less than LIMIT is Z."
	 * 
	 * @param limit
	 */
	
	public void multiples(int x, int y, int limit) {
		
			long z = 0;
		
		for (int k = 0; k < limit; K++) {
			if (k % x == 0 || k % y == 0) {
				z = z + k;
			}
		}
		
		System.out.println("The sum of all multiples of " + x + " and " + y + " less than " + limit + " is " + z + ".");

	}
}
