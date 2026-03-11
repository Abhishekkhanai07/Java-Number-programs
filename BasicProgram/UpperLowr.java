import java.util.Scanner;

public class UpperLowr {
    public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 char ch = sc.next().charAt(0);

         if(ch >= 'A' && ch <= 'Z')
         {
             System.out.println(ch+" is the upper case Alphbate");
         }
         else if (ch >= 'a' && ch <= 'z') 
         {
              System.out.println(ch+" is the lowercase case Alphbate");
         }
         else{
              System.out.println(ch+" is the special charector");
         }
    }
}
