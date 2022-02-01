package werkUren;

import java.util.Scanner;

public class WerkUren {
	public static void main(String[] args) {
		// requests input of work hours and day from user
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter the hour you started working:");
		int hourStart = keyboard.nextInt();
		while ((hourStart < 0 || hourStart > 23)) {
			System.out.println("Invalid input. Please enter hour between 0 and 23.");
		hourStart = keyboard.nextInt();}
		
		System.out.println("Please enter the minutes past the hour you started working:");
		int minStart = keyboard.nextInt();
		while ((minStart < 0 || minStart > 59)) {
			System.out.println("Invalid input. Please enter minutes between 0 and 59.");
		minStart = keyboard.nextInt();}
		
		System.out.println("Please enter the hour you finished working:");
		int hourEnd = keyboard.nextInt();
		while ((hourEnd < 0 || hourEnd > 23)) {
			System.out.println("Invalid input. Please enter hour between 0 and 23.");
		hourEnd = keyboard.nextInt();}
		
		System.out.println("Please enter the minutes past the hour you finished working:");
		int minEnd = keyboard.nextInt();
		while ((minEnd < 0 || minEnd > 59)) {
			System.out.println("Invalid input. Please enter mintues between 0 and 59.");
		minEnd = keyboard.nextInt();}
		
		System.out.println("Please enter the number of the day you started:");
		System.out.println("1 for Monday");
		System.out.println("2 for Tuesday");
		System.out.println("3 for Wednesday");
		System.out.println("4 for Thursday");
		System.out.println("5 for Friday");
		System.out.println("6 for Saturday");
		System.out.println("7 for Sunday");
		int day = keyboard.nextInt();
		
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
			System.out.println("The total hours you worked today is " + totUren + ":" + restMins + ".");
		
		}
	// THIS IS WHERE I'M STUCK! 
		double basisLoon = ((uurLoon * totUren) + (uurLoon * (restMins / 60)));
		System.out.println("Your pay for today is " + basisLoon + ".");
	
	}
		}
