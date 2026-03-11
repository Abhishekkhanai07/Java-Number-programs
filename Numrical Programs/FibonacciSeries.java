import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int fn0=0;
        int fn1=1;
           System.out.println(fn0);
           System.out.println(fn1);

           for(int i=2;i<num;i++)
           {
            int result=fn0+fn1;
            System.out.println(result);
            fn0=fn1;
            fn1=result;
           }
    }
}
