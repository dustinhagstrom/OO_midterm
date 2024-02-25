/*
 * @author Dustin Hagstrom
 */

package MX;

import java.util.Arrays;
import java.util.Objects;

public class OddAdder {
	/*
	 * @precondition x will contain between 1 and 50 elements, inclusive Each
	 * element of x will be between 0 and 100, inclusive
	 * 
	 * @parameter x, an array of integers
	 * 
	 * @returns an integer value representing the summation of all of the odd
	 * elements of x.
	 */
	public static int getSum(int[] x) {
		
		if (x == null) {
			throw new IllegalArgumentException("You must supply an array of integers.");
		}

		if (x.length < 1 || x.length > 50) {
			throw new IllegalArgumentException(
					"There must be at least 1, but no more than 50 elements.");
		}
		Arrays.sort(x);

		if (x[0] < 0 || x[x.length - 1] > 100) {
			throw new IllegalArgumentException(
					"The elements of the array must be values within the range of 0 and 100 inclusive.");
		}
		return Arrays.stream(x).filter(e -> e % 2 != 0).sum();
	}

}
