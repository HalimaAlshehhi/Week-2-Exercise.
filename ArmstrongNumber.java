
public class ArmstrongNumber {

	public static void main(String[] args) {
		 int number = 153; // Replace this number with the one you want to check
	        
	        int originalNumber, remainder, result = 0, n = 0;

	        originalNumber = number;

	        // Count number of digits
	        while (originalNumber != 0) {
	            originalNumber /= 10;
	            ++n;
	        }

	        originalNumber = number;

	        // Calculate Armstrong number
	        while (originalNumber != 0) {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, n);
	            originalNumber /= 10;
	        }

	        if (result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }
	}
