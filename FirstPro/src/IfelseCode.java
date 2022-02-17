import java.util.Scanner;

public class IfelseCode {

		
	public static void main(String [] args) {
		
		Scanner Num = new Scanner(System.in);
		
		System.out.printf("Please enter the number : ");
		
		int a = Num.nextInt();
		
		if(a%400==0)
			
			//if leap year is perfectly divisible by 400 print leap year
			
		System.out.println("The Year is a Leap Year");
		 
		else if(a%4==0 && a%100!=0)
			
			System.out.println("The Year is a Leap Year");
		
		else
		
		System.out.println("The Year is Not a Leap Year");
		
	}
	

}
