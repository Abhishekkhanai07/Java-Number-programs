import java.util.Scanner;

public class FibonacciRange {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter starting number: ");
        int st = scanner.nextInt();

         System.out.println("Enter ending number: ");
        int num = scanner.nextInt();
         
        int fn0=0;
        int fn1=1;
        
        

        for(int i=st;i<num;i++)
        {
          if (fn0>=st && fn0<=num) 
          {
            System.out.print(fn0+ " ");
          }   
          int result=fn0+fn1;
          fn0=fn1;
          fn1=result;
        }
    }
}
