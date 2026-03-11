import java.util.Scanner;
public class Avrage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();
         int count=0;
         double sum=0;
         double res=0;
         while (num!=0) 
         {
           int ld =num%10;
           sum = sum + ld;
           count++;
           num = num /10; 
                    
         }
         System.out.println("count Of Given Number is : " +count);
          System.out.println("sum Of Given Number is : " +sum);
         double Avg = sum/count;
          System.out.println("Avarage Of Given Number is : " +Avg);
    
    }
}
