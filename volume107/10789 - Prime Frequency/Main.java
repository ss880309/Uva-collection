import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++)
		{	
			
			String s = scanner.next();
			int[] a = new int[200];
			int max = -1000;
			StringBuilder sb = new StringBuilder("");
			
			for(int j=0;j<s.length();j++)
			{
				a[s.charAt(j)]++;
				max = Math.max(max, a[s.charAt(j)]);
			}
			
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==0 || a[j]==1)
					continue;
				else
				{
					boolean isPrime = true;
					for(int k=2;k<=Math.sqrt(a[j]);k++)
					{
						if(a[j]%k == 0)
							isPrime = false;
					}
					sb.append( isPrime ? (char)j : "" );					
				}	
			}
			
			System.out.println("Case "+i+": "+ (sb.length()==0 ? "empty" : sb) );
			
		}
	}
}