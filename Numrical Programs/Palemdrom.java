import java.util.Scanner;

public class Palemdrom {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();
         int temp = num;
         int sum = 0;

          while (num!=0) 
          {
         int ld = num%10;
         sum = sum*10 +ld;
         num= num/10;
                        
          }
          if(sum==temp)
          {
            System.err.println(temp+" The given number is pelemdrom " );
          }
          else
          {
             System.err.println(temp+" The given number is not pelemdrom " );
          }
     }

}
