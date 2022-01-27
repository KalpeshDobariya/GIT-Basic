package Hello;

import java.util.Scanner;

public class Calculator {
	int Num1;
	int Num2;
	
	Scanner SC = new Scanner (System.in);
	
 public float total(float a, float b, float c, float d, float e, float f)
 {
	 float total = (a+b*c-d+e)/f;
	 return total;
	 
 }
	public static void main(String[] args) {
	 
	 Calculator obj1 = new Calculator();
	 
	 float Result = obj1.total(14, 35 ,5, 55, 100,10);
	 System.out.println("total of number is : " + Result);
	 
		// TODO Auto-generated method stub
		/*
		 * Calculator Obj1 = new Calculator(); Obj1.Num1 = 7; Obj1.Num2 = 9; int sum1 =
		 * Obj1.Num1 + Obj1.Num2; System.out.println("Sum1 of two numbers :" + sum1);
		 * 
		 * Calculator Obj2 = new Calculator(); Obj2.Num1 = 40; Obj2.Num2 = 87;
		 * 
		 * int Sum2 = Obj2.Num1 + Obj2.Num2;
		 * System.out.println("Sum2 of two number is: " + Sum2);
		 */
	}

} 
