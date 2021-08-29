package practiceprograms;

public class PosNegEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=13;
		System.out.println("Number to be checked is "+number);
		if(number==0)
		{
			System.out.println(number+" is Even");
		}
		
		else if((number%2)==0)
		{
			if(number>0)
			System.out.println(number+" is Positive even");
			else
			System.out.println(number+ " is Negative even");
			
		}
		else
		{
			if(number>0)
				System.out.println(number+" is Positive Odd");
			else
				System.out.println(number+ " is Negative Odd");
		}
		
		
		
		

	}

}
