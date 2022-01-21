package triangle;

import java.util.Scanner;

public class Triangle {
	public static void main(String[] arg) {
	Scanner keyboard = new Scanner(System.in);
	
			System.out.println("length side A");
			int A = keyboard.nextInt();
			
			System.out.println("length side B");
			int B = keyboard.nextInt();
			
			System.out.println("length side C");
			int C = keyboard.nextInt();
			
			int result = A+B+C;
			
			System.out.println("The perimeter is " + result);
			keyboard.close();
		
	
	}
}
