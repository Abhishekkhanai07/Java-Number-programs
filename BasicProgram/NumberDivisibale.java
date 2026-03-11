import java.util.Scanner;

public class NumberDivisibale {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();
		 if(num%3==0 && num%5==0)
		 {
			 System.out.println(" is Raja weds rani");
		 }
		 else if(num%3==0)
		 {
			 System.out.println("is Raja");
		 }
		 else if(num%5==0)
		 {
			 System.out.println("is Rani");
		 }
	}
    
}

