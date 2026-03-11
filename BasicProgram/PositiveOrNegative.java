import java.util.Scanner;

public class PositiveOrNegative {
     public static void main(String[] args)
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();
		 if(num >=0)
		 {
			 System.out.println(num+ " is a positive"); 
		 }
		 else
		 {
			 System.out.println(num+ "is a negative");
		 }
		 
	 }
    
}
