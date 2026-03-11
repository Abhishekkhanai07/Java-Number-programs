public class Prime1 {
    public static void main(String[] args) {
        int num = 2;
        int count =0;
        if (num==0 || num==1)
        {
            System.out.println(num+" is not a prime number");
        }
        else if(num>=2)
        { 
        
            for(int i=2;i<=num/2;i++)
            {
                if(num%i==0)
                {
                    count++;
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(num+ " is the prime number");
            }
            else
            {
                System.out.println(num+ " is the not a prime");
            }
        }         
            
        }
    }
