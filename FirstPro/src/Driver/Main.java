package Driver;

import Logic.Calculator;

public class Main {

	public static void main(String[] args) {
	 
	 Calculator obj1 = new Calculator();
	 
	 float Result = obj1.total(14, 35 ,5, 55, 100,10);
	 System.out.println("total of number is : " + Result);
}
}