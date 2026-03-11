import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();


        int temp=num;

        int res=num/2;
         int sq =res*2;
         if (temp==sq)
          {
           System.out.println(temp+" is the even number");   
         }
         else
         {
            System.out.println(temp+" is the odd number");
         }

    }
}
