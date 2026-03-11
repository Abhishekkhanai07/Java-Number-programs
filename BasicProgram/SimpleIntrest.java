import java.util.Scanner;

public class SimpleIntrest {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		 System.out.println("enter the principle");
		 int p = sc.nextInt();
         System.out.println("enter the rate");
         int t = sc.nextInt();
         System.out.println("enter the time");
         int r = sc.nextInt();

       double Si= p*t*r/100;
       System.out.println("Simple interest is " +Si);

    }
}
