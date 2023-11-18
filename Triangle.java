
public class Triangle {

	public static void main(String[] args) {
		int side1 = 5; // Replace these values with the lengths of your triangle's sides
        int side2 = 5;
        int side3 = 5;

        if (side1 == side2 && side2 == side3) {
            System.out.println("The triangle is an equilateral triangle.");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("The triangle is an isosceles triangle.");
        } else {
            System.out.println("The triangle is a scalene triangle.");
        }
    }
}


