import java.util.Scanner;

public class BuzzNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int num1=num%10;
        if(num1==7 || num%7==0)
        {
            System.out.println(num+ " is the Buzz number");
        }
        else {
            System.out.println(num+ " is not Buzz number");
            
        }
    }
}
