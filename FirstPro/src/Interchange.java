import java.util.Scanner;

public class Interchange {

		public static void main(String [] args) {
			
			Scanner Num1 = new Scanner(System.in);
			
			System.out.println("Please enter the number A : ");
			
			int a = Num1.nextInt();
			
            Scanner Num2 = new Scanner(System.in);
			
			System.out.println("Please enter the number B : ");
			
			int b = Num2.nextInt();
			
		
			a= a+b;
			b=a-b;
			a=a-b;
				
				
			System.out.println("Number A is : " +a);
			 
	
			System.out.println("Number B is : " +b);
			
			
			
		}
		

	}


