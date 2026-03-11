import java.util.Scanner;

public class PerfectNum {
         public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();
         int sum =0;
         int temp=num;
         
         
         for (int i =1; i<=num/2 ;i++)
         {
            if(num%i==0)
            {
                sum = sum +i;
            }
         }
         if(sum==temp)
         {
            System.out.println(temp+" is the perfect number");
         }
         else
        {
            System.out.println(temp+ " is the not perfect number");
        }
         


    }
}
