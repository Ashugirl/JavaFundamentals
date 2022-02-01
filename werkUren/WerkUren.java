package werkUren;

import java.util.Scanner;

public class WerkUren {
	public static void main(String[] args) {
		// requests input of work hours and day from user
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the hour you started working [0-23]:");
		int hourStart = keyboard.nextInt();
		while ((hourStart < 0 || hourStart > 23)) {
			System.out.println("Invalid input. Please enter hour between 0 and 23.");
		hourStart = keyboard.nextInt();}
		
		System.out.println("Please enter the minutes past the hour you started working [0-59]:");
		int minStart = keyboard.nextInt();
		while ((minStart < 0 || minStart > 59)) {
			System.out.println("Invalid input. Please enter minutes between 0 and 59.");
		minStart = keyboard.nextInt();}
		
		System.out.println("Please enter the hour you finished working [0-23]:");
		int hourEnd = keyboard.nextInt();
		while ((hourEnd < 0 || hourEnd > 23)) {
			System.out.println("Invalid input. Please enter hour between 0 and 23.");
		hourEnd = keyboard.nextInt();}
		
		System.out.println("Please enter the minutes past the hour you finished working [0-29]:");
		int minEnd = keyboard.nextInt();
		while ((minEnd < 0 || minEnd > 59)) {
			System.out.println("Invalid input. Please enter mintues between 0 and 59.");
		minEnd = keyboard.nextInt();}
		
		// prints out the begin and end times of workday
		if ((minStart < 10) && (minEnd < 10)) {
			System.out.format("You worked from %s:0%d until %s:0%d. ", hourStart, minStart, hourEnd, minEnd);}
		else if (minStart < 10) {
			System.out.format("You worked from %s:0%d ", hourStart, minStart);
			System.out.print("until " + hourEnd + ":" + minEnd + ". ");}
		else if (minEnd < 10){
			System.out.print("You worked from " + hourStart + ":" + minStart);
			System.out.format(" until %s:0%d. ", hourEnd, minEnd);}
			else {
				System.out.println("You worked from " + hourStart + ":" + minStart + " until " + hourEnd + ":" + minEnd + ". ");}

		double uurLoon = (11.5);
		double minLoon = uurLoon / 60;
		int totUren;
		int restMins;
		int nHrs;
		int nMins;
		
		
		// accounts for working past midnight
		if (hourStart > hourEnd) {
			nHrs = ((24 - hourStart) + hourEnd - 1);
			restMins = ((60 - minStart) + minEnd);
			nMins = ((nHrs * 60) + restMins);
			totUren = (nMins/60);
			//accounts for if minutes add up to more than an hour
			if (restMins > 60){
				nHrs = nHrs + 1;
				restMins = restMins - 60;}
		}
			
		
		else {
		 nHrs = (hourEnd - (hourStart+1));
		
		restMins = ((60 - minStart) + minEnd);
		nMins = ((nHrs * 60) + restMins);
		totUren = (nMins/60);}
		
		if (restMins >= 60){
			nHrs = nHrs + 1;
			restMins = restMins - 60;}
	
		
		//prints out total of worked hours
		if (restMins < 10) {
			System.out.format("The total hours you worked today is %s:0%d.", totUren, restMins);
		} else {
			System.out.println("The total hours you worked today is " + totUren + ":" + restMins + ". ");
		
		}

		//requests input of day work started
		System.out.println("Please enter the number of the day you started [1-7]:");
		System.out.println("1 for Monday");
		System.out.println("2 for Tuesday");
		System.out.println("3 for Wednesday");
		System.out.println("4 for Thursday");
		System.out.println("5 for Friday");
		System.out.println("6 for Saturday");
		System.out.println("7 for Sunday");
		int day = keyboard.nextInt();
		while ((day < 1) || (day > 7)) {
			System.out.println("Invalid entry. Please choose a number between 1 and 7:");
			day = keyboard.nextInt();
			
		}
		// berekent basisloon
		int totMins = ((totUren * 60) + restMins);
		double basisLoon = ((minLoon * totMins));
	
		// berekent loon per dag op basis van mogelijke toeslagen en geeft het door
		switch(day) {
		 case 1:
			 System.out.printf("Your pay for today is € %.2f. ", basisLoon);
			 break;
		 case 2:
			 System.out.printf("Your pay for today is € %.2f. ", basisLoon);
			 break;	 
		case 3:
			System.out.printf("Your pay for today is € %.2f. ", basisLoon);
			 break;
		case 4:
			System.out.printf("Your pay for today is € %.2f. ", basisLoon);
			 break;
		case 5:
			if (hourStart > hourEnd) {
				double friToSatToeslag = (((((hourEnd * 60) + minEnd) * minLoon) *.25) + basisLoon);
				System.out.printf("Your pay for today is € %.2f.", friToSatToeslag);	
				} else {
					System.out.printf("Your pay for today is € %.2f. ", basisLoon);;
				}
			 break;
		case 6:
			double satToeslag = (basisLoon + (basisLoon * .25));
			if (hourStart > hourEnd) {
				double satToSunToeslag = (((((hourEnd * 60) + minEnd) * minLoon) * .25) + satToeslag); 
				System.out.printf("Your pay for today is € %.2f. ", satToSunToeslag);	
				} else {
					System.out.printf("Your pay for today is € %.2f. ", satToeslag);
				}
			 break;
		case 7:
			double sunToeslag = (basisLoon + (basisLoon * .5));
			if (hourStart > hourEnd) {
				double sunToMonToeslag = ((((totMins -(((hourEnd * 60) + minEnd))) * minLoon) *.5) + basisLoon);
				System.out.printf("Your pay for today is € %.2f. ", sunToMonToeslag);
			}else {
				System.out.printf("Your pay for today is € %.2f.", sunToeslag);
			}
			 break;
		}
	
	}
		}
