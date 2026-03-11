import java.util.*;
public class Practice {
    
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number");
     int num = sc.nextInt();
   
  int num1=num;
  int temp=num;

     int count=0;
        while (num!=0) 
        {
          count++;
          num=num/10;
        }
        int res=1;
        for(int i=0;i<count/2;i++)
        {
           res=res*10;
        }
        int fh=num1/res;
        int sh=num1%res;
        int sum=fh+sh;
        int sqar=sum*sum;
        if (temp==sqar) {
          System.out.println("tech");
        }
        else{
          System.out.println("not tech");
        }

      }
    
 
}

