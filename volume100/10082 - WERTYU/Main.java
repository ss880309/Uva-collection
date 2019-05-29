import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);	
		String a = "<`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./?";
		while(scanner.hasNext())
		{
			
			String s = scanner.nextLine().toUpperCase();
			StringBuilder sb = new StringBuilder("");
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==' ')
				{
					sb.append(' ');
					continue;
				}	
				sb.append(a.charAt(a.indexOf(s.charAt(i))-1));
			}
			
			System.out.println(sb);
				
		}
	}
}