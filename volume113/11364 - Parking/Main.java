import java.util.Arrays;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for(int i=0;i<a;i++)
		{
			
			int b = scanner.nextInt();
			int[] c = new int[b];
			
			for(int j=0;j<b;j++)
				c[j]=scanner.nextInt();
			
			Arrays.sort(c);
			
			int ans = 2*(c[c.length-1]-c[0]);
			
			System.out.println(ans);
			
		}
		
	}
}