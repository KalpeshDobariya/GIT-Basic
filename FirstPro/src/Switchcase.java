import java.util.Scanner;

public class Switchcase {


			public static void main(String [] args) {
				
				Scanner Num1 = new Scanner(System.in);
				System.out.println("Please enter the number A: ");
				float a = Num1.nextFloat();
				
				Scanner Num2 = new Scanner(System.in);
				System.out.println("Please enter the number B: ");
				float b = Num2.nextFloat();
				
				Scanner Num3 = new Scanner(System.in);
				System.out.println("Please Press 1 for Addition, 2 for Substraction, 3 for Multiplication and 4 for Division of two number : ");
				int c = Num3.nextInt();
				
	         	switch(c) {
	         	case 1: 
	         		float Add= a + b;
	         		System.out.println("Addition of two Number :" +Add); 
	         		break;
	         	case 2: 
	         		float Sub= a - b;
	         		System.out.println("Substraction of two Number :" +Sub);
	         		break;
	         	case 3: 
	         		float Mul= a*b;
	         		System.out.println("Multiplication of two Number :" +Mul);
	         		break;
	         	case 4: 
	         		if (b == 0) {
	         			System.out.println("Cannot be divided");
	         			} 
	         		else 
	         		{
	         		float Div= a/b;
	         		System.out.println("Division of two Number :" +Div);
	         		break;
	         		}
	         	}
			}
			
}
