package practiceprograms;

import java.util.Scanner;

public class DaysOfWeeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s= new Scanner(System.in);
		System.out.println("to print specific day of week enter number between 1-7: ");
		int day= s.nextInt();
		if(day==1)
			System.out.println("Today is Sunday");
		else if(day==2)
			System.out.println("Today is Monday");
		else if(day==3)
			System.out.println("Today is Tuesday");
		else if(day==4)
			System.out.println("Today is Wednesday");
		else if(day==5)
			System.out.println("Today is Thursday");
		else if(day==6)
			System.out.println("Today is Friday");
		else if(day==7)
			System.out.println("Today is Saturday");
			
		else
			System.out.println("Wrong Input.Enter number between 1-7");
		
	}

	

}
