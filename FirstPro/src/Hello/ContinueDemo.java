package Hello;

public class ContinueDemo {
	public static void main(String args[]){
		
		for(int i=1; i<=10; i++)
		{
			if (i==2 || i==5 || i==6) {
				continue;
			}
        System.out.println("Value of i is: " +i);	
		
		if (i==9) {
			break;
		}
		}
	}

}
