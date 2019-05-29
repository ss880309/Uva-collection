import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int count=0;
		
		while(scanner.hasNext())
		{
			
			if(count!=0)
				System.out.println();
			else
				count++;
			
			String s = scanner.nextLine();
			StringBuilder sb = new StringBuilder("");
			int[] a = new int[200];
			int max = -1000;
			
			for(int i=0;i<s.length();i++)
			{
				a[s.charAt(i)]++;
				max = Math.max(max, a[s.charAt(i)]);
			}
			
			for(int j=1;j<=max;j++)
			{
				for(int i=a.length-1;i>=0;i--)
				{
					if(a[i]!=0 && a[i]==j)
						System.out.println(i+" "+a[i]);					
				}
			}
			
		}
		
	}
}