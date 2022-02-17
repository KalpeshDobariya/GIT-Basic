package GlAssignment;

import java.util.Scanner;

public class Main {
	


//function to checkPalindrome

public static void checkPalindrome()  {
	
	Scanner in = new Scanner(System.in);

    System.out.println("Enter an input number");
    int num = in.nextInt();

    // Assign number in n.
    int n = num;

    int rev = 0, digit;

    // Logic to reverse a number
    while (n > 0) {

      digit = n % 10;
      rev = rev * 10 + digit;
      n = n / 10;
    }

    /*
     * If original and reverse of a number 
     * is equal then it's a palindrome number.
     */
     if (rev == num) {
       System.out.println(num + " is palindrome");
       
       System.out.println();
     } else {
       System.out.println(num + " is not a palindrome");
       System.out.println();
     }
 }







//function to printPattern

public static void printPattern() {
		
		Scanner SC= new Scanner(System.in);
		System.out.println("Enter a Value of Line to print * : ");
		
		int a=SC.nextInt(); 
		
		for (a=a ;a>0; a--) 
		{
		   for (int i=0; i<a; i++) 
		    {
			System.out.print("*");
		    }
		    System.out.println();
		
		 }
		System.out.println();
		System.out.println();
        }



//function to check no is prime or not

 public static void primeNoCheck() {
 	
	Scanner SC= new Scanner(System.in);
		System.out.println("Enter the Number you want to check if number is prime or composite");
    int num= SC.nextInt();


	boolean isPrime = primeNo(num);
	
	if(isPrime)
	{
		System.out.println("= Number " +(num) +  " is a prime number =");
		System.out.println();
		System.out.println();
	}
	else
	{
		System.out.println("= Number " +(num) + " is a composite number =");
		System.out.println();
		System.out.println();
	}
	}
	
      public static boolean primeNo(int num)
       {
	         int c=0;
	         
	         for (int i=2; i<num; i++) 
	         {
		     if(num%i == 0) 
		     {	 
			 c++;
		     }	
	         }
          
	         if (c>0)
	         {
		     return false;
	         }
	         else {
		     return true;
		     }
       }
     	
       

 

//function to print Fibonacci Series

  public static void printFibonacciSeries() 
  {
	    
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter till where fibonacci number you need to print : ");
	  int x= sc.nextInt();
	  int temp;
	  int fir = 0, sec = 1;
  
    System.out.print(fir +"  ");
    System.out.print(sec+"  ");
 
    for (int a=1; a<=x-2;a++){
       temp= sec;
	   sec= fir+ sec;
	   fir=temp;
	   System.out.print(sec+ "  ");
     }
  System.out.println();
  System.out.println();
  }}
     

