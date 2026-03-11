import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();
         
         int largest = num%10;
         num = num/10;
    
         while (num!=0) {
            int ld = num%10;
            if(ld > largest)
            {
                largest =ld;
            }
            num=num /10;
         }
         System.err.println("the largest value is "+largest);
    }
    
    
}
