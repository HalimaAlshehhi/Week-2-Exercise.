
public class Numbers {

	public static void main(String[] args) {
		int number = 28; // You can change this number to test different values

        int aliquotSum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                aliquotSum += i;
            }
        }

        if (aliquotSum == number) {
            System.out.println(number + " is a perfect number.");
        } else if (aliquotSum > number) {
            System.out.println(number + " is an abundant number.");
        } else {
            System.out.println(number + " is a deficient number.");
        }
    }

	}
