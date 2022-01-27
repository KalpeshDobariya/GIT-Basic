import java.util.Scanner;

public class ScannerClass {

 public static void main(String[] args) {
	 
	 // declare variables and assign values
	 

	 // declare variables and assign values
	 int num1;
	 float num2;
	 char character;
	 boolean bool;
	 String str;
	 double num3;
	 
	    Scanner a = new Scanner(System.in);
		System.out.println("enter int value ");
		 num1 = a.nextInt();
		 System.out.println("enter float value ");
		 num2 = a.nextFloat();
		 System.out.println("enter string value ");
		 str = a.next();
		 System.out.println("enter double value ");
		 num3 = a.nextDouble();
		 System.out.println("enter Char value ");
		 character = a.next().charAt(0);
	
	 
	 System.out.println("int = " + num1);
	 System.out.println("float = " + num2);
	 System.out.println("String = " + str);
	 System.out.println("Double = " + num3);
	 System.out.println("Double = " + character);

 }

}
