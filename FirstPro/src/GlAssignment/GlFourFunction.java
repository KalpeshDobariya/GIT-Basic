package GlAssignment;

import java.util.Scanner;

import OOp.printPattern;


public class GlFourFunction {
	

      
//*main method which contains switch and do while loop*
	  
	  //main method start

      public static void main(String[] args) {

                int select;
                
                Main obj = new Main();

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();
System.out.println();
select = sc.nextInt();

switch (select) {

case 0:{
select = 0;
}break;

 

case 1: {
obj.checkPalindrome();
}break;

 

case 2: {
obj.printPattern();
}break;

 

case 3: {
obj.primeNoCheck();
}break;

 

case 4: {
obj.printFibonacciSeries();
}break;



default:
{
System.out.println("Invalid function selection. Enter a valid no.\n");
}
}
}
 

while (select != 0);
System.out.println("Exited Successfully!!!");
sc.close();
}
}



      
    

 

      

