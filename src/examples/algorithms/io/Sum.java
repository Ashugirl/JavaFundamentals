package examples.algorithms.io;
import java.util.*;

public class Sum {
	public static void main(String[] args) {
		var keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		var a = keyboard.nextInt(); // Input
		
		System.out.print("Enter another number:");
		var b = keyboard.nextInt(); // Input
		var sum = a + b;
		
		System.out.println("The sum is " +sum); // Output
		keyboard.close();
		
	}

}
