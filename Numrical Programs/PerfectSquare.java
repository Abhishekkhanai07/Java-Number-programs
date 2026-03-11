import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();
         int res=0;
         int sqrt=0;
         for(int i=1 ; i<=num;i++)
         {
             
                if(i*i==num)
                {
                    res =i*i;
                    sqrt=i;
                    break;
                }     
         }
         if (res==num)
          {
            System.out.println(sqrt+ " is the perfect sqr of "+num);
         }
         else
         {
            System.out.println(sqrt+ " is not perfect sqr of "+num );
         }
    }
}
