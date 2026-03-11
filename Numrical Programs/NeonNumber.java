import java.util.Scanner;

public class NeonNumber {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
         
       int sqrt = num*num;
       int sum=0;
       while (sqrt!=0)
        {
            int ld = sqrt%10;
            sum = sum+ld;
            sqrt=sqrt/10;
       }
       if(sum==num)
       {
        System.out.println(num+ " is the neon number");
       }
       else
       {
        System.out.println(num+ " is not neon number");
       }
    }
}
