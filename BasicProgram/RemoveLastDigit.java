import java.util.Scanner;

public class RemoveLastDigit {
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();

         int res = num /10;
         System.out.println(" After Remove last digit num is "+res );
    }
    
}
