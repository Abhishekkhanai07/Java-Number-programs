import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int temp=num;
        int num1=num;
        int sum=0;
        int count=0;
        while (num!=0)
         {
          count++;
          num=num/10;  
        }

        while (temp!=0)
         {
          int ld =temp%10;
          int res=1;
          for(int i=1;i<=count;i++)
          {
            res=res*ld;
          }
            sum=sum+res;
            count--;
            temp=temp/10;
        }
        if(sum==num1)
        {
             System.out.println(num1+" is disarium number");
        }
        else{
            System.out.println(num1+" is not disarium number");
        }
    }
}
