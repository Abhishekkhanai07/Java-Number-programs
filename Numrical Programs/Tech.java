import java.util.Scanner;

public class Tech {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        
        int temp=num;
        int num1=num;
        int sum=0;
         
        int rev=1;
        int count=0;
        while (num!=0)
         {
          count++;  
          num=num/10;
         }

         for(int i=1;i<=count/2;i++)
         {
          rev=rev*10;
         }
           int fh=num1/rev;
           int sh=num1%rev;
            sum=fh+sh;
            int res=sum*sum;
          
         if (res==temp) 
           {
            System.out.println(temp+ " is the tech number");
           }  
           else
           {
            System.out.println(temp+ " is not tech number");
           }
        
    }
}
