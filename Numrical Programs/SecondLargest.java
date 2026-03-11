import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();

         int largest = num % 10;
         int large2 = 0;
         num = num /10;
         while (num!=0) 
         {
           int ld = num % 10;
           if( largest < ld )
           {
                large2 =largest;
                largest =ld;
           } 
           else if( large2 < ld  && largest != ld)
           {
               large2 = ld;
           }
           num= num/10; 
         }
         System.out.println("the 1st smallest number is  "+largest);
          System.out.println("the 2nd smallest number is  "+large2);
    }

    
}
