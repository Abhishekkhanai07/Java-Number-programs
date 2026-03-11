import java.util.Scanner;

public class SwappingNumber {

    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the num1");
		 int num1 = sc.nextInt();
         int a=num1;
         System.out.println("enter the num2");
		 int num2 = sc.nextInt();
         int b= num2;
		 
		 int temp = num1;
		 num1 = num2;
		 num2 = temp;
		 
		 System.out.println("After Swapping "+a+ " :is " +num1);
		 System.out.println("After Swapping " +b+ " : is " +num2);
		 
	}
    
}
