package personalInfo;

import java.util.*;

public class PersonalInfo {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		
				System.out.println("Name?");
				String name = scanner.nextLine();
				
					
				System.out.println("Where do you live?");
				String town = scanner.nextLine();
				
				System.out.println("Age?");
				int age = scanner.nextInt();
								
				System.out.printf("My name is %s. I live in %s. I am %d%n years old. ", name, town, age);
				
		scanner.close();
		
			              
}}
