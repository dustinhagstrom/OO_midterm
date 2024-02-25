package MX;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OddAdderTest {

	@Test
	@DisplayName("Zero test case")
	void testZ() {
		int [] x = new int[] {};
		assertThrows(IllegalArgumentException.class, () -> OddAdder.getSum(x));
	}
	
	@Test
	@DisplayName("Null test case")
	void testNull() {
		assertThrows(IllegalArgumentException.class, () -> OddAdder.getSum(null));
	}
	
	@Test
	@DisplayName("One test case")
	void testO() {
		int [] x = new int[] {1};
		int [] x1 = new int[] {3};
		int [] x2 = new int[] {2};
		int [] x3 = new int[] {10};
		int [] x4 = new int[] {100};
		int [] x5 = new int[] {0};
		assertEquals(1, OddAdder.getSum(x));
		assertEquals(3, OddAdder.getSum(x1));
		assertEquals(0, OddAdder.getSum(x2));
		assertEquals(0, OddAdder.getSum(x3));
		assertEquals(0, OddAdder.getSum(x4));
		assertEquals(0, OddAdder.getSum(x5));
	}
	
	@Test
	@DisplayName("Many and more complicated test case")
	void testM() {
		int [] x = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		int [] x1 = new int[] {21, 22, 23, 24, 25, 26, 27, 28};
		int [] x2 = new int[] {2, 4, 6, 8, 10, 12, 14, 21};
		int [] x3 = new int[] {1, 1, 1, 1, 1, 1, 1, 1, 99, 2, 2, 2, 2, 2, 2};
		assertEquals(100, OddAdder.getSum(x));
		assertEquals(96, OddAdder.getSum(x1));
		assertEquals(21, OddAdder.getSum(x2));
		assertEquals(107, OddAdder.getSum(x3));
	}
	
	@Test
	@DisplayName("Boundary Case")
	void testB() {
		
		//filled array with ith value
		int [] x = new int[50];
		for (int i = 0; i < x.length; i++) {
			x[i] = i;
		}
		//filled array with max value of element
		int [] x1 = new int[50];
		for (int i = 0; i < x1.length; i++) {
			x1[i] = 99;
		}
		//filled array with min value of element
		int [] x2 = new int[50];
		for (int i = 0; i < x2.length; i++) {
			x2[i] = 1;
		}
		assertEquals(625, OddAdder.getSum(x));
		assertEquals(4950, OddAdder.getSum(x1));
		assertEquals(50, OddAdder.getSum(x2));
	}
	

	@Test
	@DisplayName("Exception test case")
	void testE() {
		int [] x = new int[51];
		for (int i = 0; i < x.length; i++) {
			x[i] = i;
		}
		
		int [] x1 = new int[] {0, 1000, 1};
		int [] x2 = new int[] {-1, 101, 1, 1};
		assertThrows(IllegalArgumentException.class, () -> OddAdder.getSum(x));
		assertThrows(IllegalArgumentException.class, () -> OddAdder.getSum(x1));
		assertThrows(IllegalArgumentException.class, () -> OddAdder.getSum(x2));
	}
	
	@Test
	@DisplayName("Simple test case")
	void testS() {
		int [] x = new int[] {1, 3, 5, 7, 9};
		
		int [] x1 = new int[] {0, 2, 4, 6, 8, 10};
		assertEquals(25, OddAdder.getSum(x));
		assertEquals(0, OddAdder.getSum(x1));
	}

}
