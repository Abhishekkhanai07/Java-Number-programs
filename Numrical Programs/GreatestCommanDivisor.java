import java.util.Scanner;

public class GreatestCommanDivisor {
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number1: ");
        int num = scanner.nextInt();

        System.out.println("Enter a number2: ");
        int num1 = scanner.nextInt();

        int res=0;
        for(int i=1; i<=num && i<= num1;i++)
        {
           if (num%i==0 && num1%i==0) 
           {
               res = i;
           }
        }
        System.out.println("the greatest divisior is "+res);
         
        }

   } 

