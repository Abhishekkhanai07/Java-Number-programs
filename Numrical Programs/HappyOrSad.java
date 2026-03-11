import java.util.Scanner;

public class HappyOrSad {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int temp=num;
        while (true) {
            
        
        int sum=0;
        int res=0;
        while (num!=0)
         {
          int ld =num%10;
           res=ld*ld;
           sum=sum+res;
           num=num/10;
         } 
           if (sum==1)
            {
            System.out.println(temp+" is the happy number");
            break;
           }
           else if (sum==4) 
           {
            System.out.println(temp+" is the sad number");
            break;
           }
                      num=sum;
        }
    }
}
