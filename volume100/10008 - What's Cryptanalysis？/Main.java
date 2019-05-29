import java.util.Arrays;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int n = scanner.nextInt();
			String[] s = new String[n]; 
			int[] a = new int[26];
			Arrays.fill(a, 0);
			int max = -1000;
			for(int i=0;i<n;i++)
			{
				
				while((s[i] = scanner.nextLine()).equals(""));// java's \n bug
				//s[i] = scanner.nextLine();
				s[i] = s[i].toUpperCase();
				
				for(int j=0;j<s[i].length();j++)
				{
					if('A'<=s[i].charAt(j) && s[i].charAt(j)<='Z')
					{
						a[s[i].charAt(j)-'A']++;
						max = Math.max(max,a[s[i].charAt(j)-'A']);
					}
				}
			}
			//System.out.println(max);
			for(int i=max;i>0;i--)
			{
				for(int j=0;j<26;j++)
				{
					if(a[j]==i)
						System.out.println((char)(j+'A')+" "+i);
				}
			}
			
		}
		
	}
}