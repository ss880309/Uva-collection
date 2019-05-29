import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)	
	{
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			String string = scanner.nextLine();
			String[] s = string.split(" ");
			StringBuilder sb = new StringBuilder("");
			
			for(int i=0;i<s.length;i++)
			{
				sb.append(new StringBuilder(s[i]).reverse());
				if(i!=s.length-1)
					sb.append(" ");
			}
			
			System.out.println(sb);
			
		}
	}
}

