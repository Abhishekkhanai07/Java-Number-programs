import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) 
	{
      Scanner sc = new Scanner(System.in);
		 System.out.println("enter the number");
		 int num = sc.nextInt();
			  
          int small = num%10;	        
          num = num/10;	       
           while(num!=0)	      
             {
	          int ld = num % 10;       
                 if (small > ld )
	           {
	             small=ld;
	           }
	           num =num/10;
	          
	        }
	        System.out.println(small);
	  }
	}
