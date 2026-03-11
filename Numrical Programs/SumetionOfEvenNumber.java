import java.util.Scanner;

public class SumetionOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();
         int sum = 0;
         
        
         while (num!=0) 
         {
           int ld = num%10;
           num= num /10;
           if(ld % 2 ==0)
           {
             sum = sum + ld;
            
           }
            
         }
     System.err.println(sum);
    }
}
