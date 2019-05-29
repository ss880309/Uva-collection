import java.util.Arrays;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);		
		
		int n = scanner.nextInt();	
		for(int i=0;i<n;i++)
		{
			
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			int[][] c = new int[b][a];
			int[] m = new int[a];//mark
			Arrays.fill(m, 0);
			
			int max = -1000;
			for(int j=0;j<b;j++)
			{
				for(int k=0;k<a;k++)
				{
					c[j][k]=scanner.nextInt();
					if(c[j][k]==1)
					{
						m[k]++;
						max = Math.max(max,m[k]);
					}
				}
			}
			
			int ans = 1;			
			for(int j=0;j<m.length;j++)
			{
				if(m[j]!=0)
				{
					ans*=m[j];
				}
			}
			
			System.out.println(ans);
			
		}
		
	}
}