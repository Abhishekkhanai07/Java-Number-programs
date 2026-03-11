import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		 System.out.println("enter the first number");
		 int a = sc.nextInt();
         System.out.println("enter the second number");
          int b = sc.nextInt();
          System.out.println("enter the thrid number");
           int c = sc.nextInt();


         String result = (a > b && a > c) ? a+ " is the largest" : (b > c) ? b+ " is the lagest" : c+ " is the lagest";
         System.err.println(result);
    }
}
