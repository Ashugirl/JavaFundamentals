package salaryCalculate;
import java.util.*;

public class SalaryCalculate {
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter bruto salary:");
		int brutSal = scanner.nextInt();
		
		System.out.println("Enter tax rate %:");
		int taxPercent = scanner.nextInt();
		
		int withholding = (brutSal*taxPercent)/100;
		
		int nettoSal = brutSal-withholding;
		
		System.out.println("Your netto salary will be " + nettoSal);
		
	scanner.close();		
	}
	
}
