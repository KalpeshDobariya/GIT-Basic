import java.util.Scanner;

public class Whileloop {
	
	public static void main(String[] args) {
		
		Scanner SC= new Scanner(System.in);
		System.out.println("Enter i Value:");
		int i=SC.nextInt();
		System.out.println("Enter a Value:");
		int a=SC.nextInt(); 
		
		 while (i<=a)
		 {
			System.out.println(i);
			i=i+2;	
		
		 }
		
}

}
