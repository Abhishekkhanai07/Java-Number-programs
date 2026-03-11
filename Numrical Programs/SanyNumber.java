import java.util.Scanner;

public class SanyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();
         int res=0;
         int num1=num+1;
         int sqrt=0;
         for(int i=1 ; i*i<=num1;i++)
         {
             
                if(i*i==num1)
                {
                    res =i*i;
                    sqrt=i;
                    break;
                }     
         }
         if (res==num1)
          {
            System.out.println(num+ " is the sunny number");
         }
         else
         {
            System.out.println(num+ " is not sunny number " );
         }
    }
}
