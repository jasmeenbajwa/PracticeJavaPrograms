package practiceprograms;

public class MaxInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1, num2, num3, max;
		num1=25;
		num2= 35;
		num3= 15;
		System.out.println("To find maximum of three numbers "+ num1 +" "+ num2+" "+ num3);
		if(num1>num2 )
		{  if (num1>num3)
			System.out.println(num1+" is maximum of all 3 numbers");
			else
			System.out.println(num3+" is maximum from all 3 numbers.");
		}
		else if(num2>num3)
			System.out.println(num2+" is maximum from all 3 numbers.");
		else
			System.out.println(num3+" is maximum from all 3 numbers.");
			
		
		
		 
	}

}
