import java.util.Arrays;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)	
	{
		Scanner scanner = new Scanner(System.in);
		String num = "22233344455566677778889999";
		
		while(scanner.hasNext())
		{
			String s = scanner.next();
			StringBuilder sb = new StringBuilder("");
			
			for(int i=0;i<s.length();i++)
			{
				if('A'<=s.charAt(i) && s.charAt(i)<='Z')
					sb.append(num.charAt(s.charAt(i)-'A'));
				else
					sb.append(s.charAt(i));
			}
			
			System.out.println(sb);
			
		}
	}
}

