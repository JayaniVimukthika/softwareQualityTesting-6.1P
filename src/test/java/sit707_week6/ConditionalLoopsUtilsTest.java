package sit707_week6;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import org.junit.Test;

public class ConditionalLoopsUtilsTest {
		@Test
		public void testSumWithForLoop() {
			 int result = conditionalLoopsUtil.sumWithForLoop(2);
			 Assert.assertEquals(3, result);
			 System.out.println("Test sumWithForLoop: passed");
		 }
		 
		@Test
		 public void testIsPrimeWithLoopPrimeNumber() {
			 boolean result = conditionalLoopsUtil.isPrimeWithLoop(11);
			 Assert.assertTrue(result);
			 System.out.println("Test sPrimeWithLoop with a prime value: passed");
			 }
		 
		@Test
		 public void testIsPrimeWithLoopNonPrimeNumber() {
			 boolean result = conditionalLoopsUtil.isPrimeWithLoop(12);
			 Assert.assertFalse(result);
			 System.out.println("Test isPrimeWithLoop with a non-prime number: passed");
		}
		
		 
		 @Test
		 public void testSumWithForLoopNegativeInput() {
			 int result = conditionalLoopsUtil.sumWithForLoop(-2);
			 Assert.assertEquals(0, result); 
			 System.out.println("Test sumWithForLoop with a negative number as input: passed");
		 }
		 
		 @Test
		 public void testSumWithForLoopZeroInput() {
			 int result = conditionalLoopsUtil.sumWithForLoop(0);
			 Assert.assertEquals(0, result);
			 System.out.println("Test sumWithForLoop with zero as the input: passed");
		 }
		 
		 @Test
		 public void testIsPrimeWithLoopOneAsInput() {
			 boolean result = conditionalLoopsUtil.isPrimeWithLoop(1);
			 Assert.assertFalse(result);
			 System.out.println("Test isPrimeWithLoop with 1 as the input: passed");
		 }
		 @Test
		 public void testIsPrimeWithLoopLargePrimeNumber() {
			 boolean result = conditionalLoopsUtil.isPrimeWithLoop(257);
			 Assert.assertTrue(result);
			 System.out.println("Test isPrimeWithLoop with a large prime number: passed");
		}
		


}
