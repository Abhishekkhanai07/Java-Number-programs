import java.util.Scanner;

public class Strong {

    public static int factorial(int num)
    {
        int fact = 1;
        for(int i =1; i <=num ; i++)
        {
           fact = fact * i; 
        }
        return fact;
    }
     public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();
         int sum =0;
        int temp = num;

         while (num!=0)
          {
            int ld = num % 10;
            sum = sum + factorial(ld);  
            num = num /10; 
         }
         
         if(temp==sum)
         {
                 System.out.println(temp+ " is the strong number");
         }
         else{
            System.out.println(temp+ " is the not strong number");
         }
        

     }
}
