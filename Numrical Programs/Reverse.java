import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();
         int temp=num;
         int sum = 0;

          while (num!=0) 
          {
         int ld = num%10;
         sum = sum*10 +ld;
         num= num/10;
                        
          }
         System.err.println(" Revers of gibven number is  " +sum);
        


     }
}