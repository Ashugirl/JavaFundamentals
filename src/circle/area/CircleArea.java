package circle.area;
import java.util.*;

public class CircleArea {
	public static void main(String[] args) {
		var keyboard = new Scanner(System.in);
	
		System.out.print("Enter the radius:");
		var r = keyboard.nextInt(); //Input
	
		double Pi = 3.1415926535898;
			
		double area = Pi*r*r;
		
		System.out.println("The area is " +area); // Output
		keyboard.close();
		
	
	
	

}}
