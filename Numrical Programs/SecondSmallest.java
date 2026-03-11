import java.util.Scanner;

public class SecondSmallest {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();

         int small = num % 10;
         int small2 = Integer.MAX_VALUE;
         num = num /10;
         while (num!=0) 
         {
           int ld = num % 10;
           if( small > ld )
           {
                small2 =small;
                small =ld;
           } 
           else if( small2>ld  && small != ld)
           {
               small2 = ld;
           }
           num= num/10; 
         }
         System.out.println("the 1st smallest number is  "+small);
          System.out.println("the 2nd smallest number is  "+small2);
    }

    
}
