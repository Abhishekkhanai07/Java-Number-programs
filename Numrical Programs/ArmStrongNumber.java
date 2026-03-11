import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int temp = num;
        int temp1=num;
        int sum=0;
        int count=0;

        while(num!=0)
        {
            count++;
            num = num/10;
        }

        while (temp!=0)
         {
            
            int res=1;
          int ld = temp%10;
          for(int i=1;i<=count;i++)
          {
            res = res*ld;             
          }
           sum=sum+res;
            temp=temp/10;
        }

          if(sum==temp1)
          {
            System.out.println( temp1+" is the arm strong number");
          }
          else
          {
            System.out.println( temp1+" is the not arm strong number");
          }
     }
}

