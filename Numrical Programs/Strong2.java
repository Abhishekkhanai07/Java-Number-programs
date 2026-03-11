public class Strong2 {
    public static void main(String[] args) {
        int num = 145;
        int sum = 0;
        int temp=num;
        while (num!=0)
        {
            int ld = num % 10;
            int fact=1;
            for(int i =1 ;i<=ld;i++)
            {
                fact=fact*i;
            }
            sum = sum+fact;
            num=num/10;
        }
        if (temp==sum)
         {
            System.out.println(temp+ " is the Strong number");
            }
            else
            {
                System.out.println(temp+ " is not a strong number");
            }
            
        }
    }

