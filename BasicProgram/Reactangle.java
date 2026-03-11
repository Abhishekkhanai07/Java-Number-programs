import java.util.Scanner;

public class Reactangle {

    public static double reactangle(double a , double b)
    {
        return  a*b;
    }
    
    
    
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
		 System.out.println("enter the length");
		 int l = sc.nextInt();
         System.out.println("enter the breadth");
         int b = sc.nextInt();
         
         System.out.println(reactangle(l,b));

    }
}
