import java.util.Scanner;

public class ArmStrong1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        int originalNum = num;
        double result = 0;
        int count = 0;

        int temp = num;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, count);
            temp /= 10;
        }

        if (result == originalNum) {
            System.out.println(originalNum + " is an Armstrong number.");
        } else {
            System.out.println(originalNum + " is not an Armstrong number.");
        }

    }
}


