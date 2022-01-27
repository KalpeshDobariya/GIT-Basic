import java.util.Scanner;

public class Breakcontinue {
	
	public static void main(String [] args) {
		

           Scanner Num1 = new Scanner(System.in);
		   System.out.println ("Please enter the number A: ");
           int a = Num1.nextInt();
           int i=1;
           int j=1;
           
           for(;;j++)
           {
        	   if(j%a !=0)
        		   continue;
           
              else if(j>a*10)
        		   
        	   break;
           
        	   
           else
        	   System.out.println(a +"*"+i +"=" +j);
        	   i++;
}          
           }
}



