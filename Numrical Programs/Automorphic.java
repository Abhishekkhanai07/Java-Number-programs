import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int temp=num;
        int num1=num*num; 

        while (num!=0)
         {
          int ld = num%10;
          int ld1 = num1%10;

          if (ld==ld1)
           {
            num=num/10;
            num1=num1/10;
          }
          else break;
        }
       if(num==0)
       {
         System.out.println(temp+ " is the Automorphic number");
       }
       else
       {
         System.out.println(temp+ " is not Automorphic number");
       }
         
    }
}
