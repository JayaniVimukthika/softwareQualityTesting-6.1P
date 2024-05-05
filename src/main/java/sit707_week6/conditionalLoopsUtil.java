package sit707_week6;

public class conditionalLoopsUtil {

	//sumation of numbers win the use of for loop
	public static int sumWithForLoop(int number) {
		 int sum = 0;
		 for (int i = 1; i <= number; i++) 
		 {
			 sum += i;
		 }
		 return sum;
		 }
		 
		//check for prime numbers wuth  for loop
		 public static boolean isPrimeWithLoop(int num) {
			 //if number is less than 1 it will return false
			 if (num <= 1) {
				 return false;
			 }
			 //
			 for (int i = 2; i <= Math.sqrt(num); i++) {
				 if (num % i == 0) {
					 return false;
				 }
			 }
			 return true;
		 }

}
