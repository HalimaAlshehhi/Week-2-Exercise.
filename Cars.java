// Import the HashSet class
import java.util.HashSet;

public class Cars {
  public static void main(String[] args) {
	  
	  
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
    
    //check if hashset contains this car
    System.out.println(cars.contains("Mazda"));
//remove a car
    cars.remove("Volvo");
    System.out.println(cars);
    
    cars.clear();
    System.out.println(cars);
  }
}