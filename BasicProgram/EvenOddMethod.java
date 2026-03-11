public class EvenOddMethod {

    public static String evebOdd(int num)
    {
        if(num%2==0)
        {
            return "even";
        }else
        {
            return "odd";
        }
    }
    public static void main(String[] args)
    {
      System.err.println(evebOdd(10));
    }
    
}
