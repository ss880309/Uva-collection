import java.util.Arrays;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 1;
		for(int i=0;i<n;i++)
		{
		
			StringBuilder sb = new StringBuilder(scanner.next());
			StringBuilder num = new StringBuilder("");
			StringBuilder ans = new StringBuilder("");
			int m10=0;
			for(int j=sb.length()-1 ; j>-1 ; j--)
			{
				if('A'<=sb.charAt(j) && sb.charAt(j)<='Z')
				{
					for(int k=0;k<Integer.parseInt(num.toString());k++)
						ans.append(sb.charAt(j));
					num.delete(0, sb.length());
					
				}
				else
				{
					if(sb.charAt(j)=='0')
					{
						m10=1;
						continue;
					}
					
					if(m10==0)
						num.append(sb.charAt(j));
					else// 0 cant append to stringbuilder , so...
					{
						num.append((int)(sb.charAt(j)-'0')*10);
						m10=0;
					}
				}
			}
			
			System.out.println("Case "+(count++)+": "+ans.reverse());
			
		}
	}
}