import java.util.Scanner;

public class XylemOrPhioem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();

         int os =num%10;
         num=num/10;
         int is =0;
         while(num>9)
         {
             is =is+num%10;
            num=num/10;

         }
         os=os+num;
         
         if(is==os)
         {
             System.out.println("xylem");
         }
         else{

         
         System.out.println("phloem");
         }
    }
}
