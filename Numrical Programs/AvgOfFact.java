import java.util.Scanner;

public class AvgOfFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();

         double sum = 0;
         int count=0;
         double avg=0;

         for (int i= 1;i<=num;i++)
         {
            if(num%i==0)
            {
               sum= sum+i;
               count++;
            }
          
         }
            System.err.println( "sum of the factor is the " +sum);
          System.err.println("count of factor is the " +count);
         avg = sum/count;
         System.out.println("avg of given number is " +avg);
    }
}
