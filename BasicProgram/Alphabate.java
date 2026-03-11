import java.util.*;

public class Alphabate {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char res = sc.next().charAt(0);
		
		if (res >= 'A' && res <='Z'|| res<='z'&&res>='a')
		{
			System.out.println("Alphabate");
		}
		else if(res <='9' && res >='0')
		{
			System.out.println("digit");
		}
		else
		{
			System.out.println("special");
		}
		
		
	}

}