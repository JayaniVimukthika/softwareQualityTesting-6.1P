package sit707_week6;

import org.junit.Assert;
import org.junit.Test;

public class WeatherAndMathUtilsTest {
	
	@Test
	public void testStudentIdentity() {
		String studentId = "s220194805";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Jayani";
		Assert.assertNotNull("Student name is null", studentName);
	}
	
    @Test
    public void testCancelWeatherAdvice() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(70.1, 0.0));
    }
    
    
    @Test
    public void testWeatherAdviceAllClear() {
    	Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(40.0,2.0));
    	System.out.println("Weather advice test for all clear: passed");
    }
    
    
    @Test
    public void testWeatherAdviceCancelDangerousWindSafeRainfall() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(85.0, 2.0));
    	System.out.println("Weather advice test for dangerous wind speed and safe precipitation: passed");
    }
    
    
    @Test
    public void testWeatherAdviceCancelDangerousRainSafeWind() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(35.0, 8.0));
    	System.out.println("Weather advice test for dangerous rainfall and safe wind speed: passed");
    }
    
    @Test
    public void testWeatherAdviceCancelConcerningWindRain() {
    	Assert.assertEquals("CANCEL", WeatherAndMathUtils.weatherAdvice(60.0,6.0));
    	System.out.println("Weather advice test for dangerous wind speed and rainfall: passed");
    }
    
    @Test
    public void testWeatherAdviceWarnConcerningWindLessWarnRainfall() {
    Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(55.0, 2.0));
    System.out.println("Weather advice test for warning for wind speed: passed");
    }
    
    @Test
    public void testWeatherAdviceWarnConcerningRain() {
    	Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(20.0, 5.0));
    	System.out.println("Weather advice test for warning because of concerning rainfall: passed");
    }
    
    @Test
    public void testWeatherAdviceWarnConcerningWindRain() {
    	Assert.assertEquals("WARN", WeatherAndMathUtils.weatherAdvice(55.0, 4.0));
    	System.out.println("Weather advice test for warning because of concerning wind speed and rainfall:passed");
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testWeatherAdviceInvalidInputNegativeValues() {
    	WeatherAndMathUtils.weatherAdvice(-8.0, 5.0);
    	System.out.println("Test for invalid input (negative value): passed");
    }
    
    public void testWeatherAdviceInvalidInputZero() {
    	Assert.assertEquals("ALL CLEAR", WeatherAndMathUtils.weatherAdvice(0.0, 0.0));
    	System.out.println("Test for invalid input(zero): passed");
    }
    
    //zero input IllegalArgumentException
//    @Test(expected = IllegalArgumentException.class)
//    public void testWeatherAdviceInvalidInputZero() {
//    	WeatherAndMathUtils.weatherAdvice(0.0, 0.0);
//    	System.out.println("Test for invalid input(zero): passed");
//    }
    
    @Test
    public void testIsPrimePrimeNumber() {
	    Assert.assertTrue(WeatherAndMathUtils.isPrime(7));
	    System.out.println("Test for a prime number: passed");
    }
    
    @Test
    public void testIsPrimeNonPrimeNumber() {
	    Assert.assertFalse(WeatherAndMathUtils.isPrime(12));
	    System.out.println("Test for a non-prime number: passed");
    }
    
    @Test
    public void testIsEvenEvenNumber() {
	    Assert.assertTrue(WeatherAndMathUtils.isEven(6));
	    System.out.println("Test for even numbers: passed");
    }
    
    @Test
    public void testIsEvenOddNumber() {
	    Assert.assertFalse(WeatherAndMathUtils.isEven(3));
	    System.out.println("Test for odd number: passed");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
