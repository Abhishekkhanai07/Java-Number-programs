package Demo;

public class A3 {
    
 public static void main(String[] args) {
    
       String str = "abc1211xya123";

        char[] ch = str.toCharArray();
        int totalDigits = 0;

        // count total digits
       for(char i='0';i<='9';i++)
       {
        int count=0;
            for(int j=0;j<ch.length;j++)
            {
                if(ch[j]==i)
                {
                   count++;
                }
               
            }
            if (count>0) {
                System.out.println(i+ " is Repeted at "+count);
            }
            
       }

 }
}
