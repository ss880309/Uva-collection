import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)	
	{
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		for(int i=1;i<=n1;i++)
		{
			
			String[] s = new String[10];
			int[] a = new int[10];
			
			int max = -1000;
			for(int j=0;j<10;j++)
			{
				s[j] = scanner.next();
				a[j] = scanner.nextInt();
				max = Math.max(max, a[j]);
			}
			
			StringBuilder sb = new StringBuilder("Case #"+i+":\n");
			
			for(int j=0;j<10;j++)
			{
				if(a[j]==max)
					sb.append(s[j]+"\n");
			}
			
			System.out.print(sb);
			
		}		
	}
}

