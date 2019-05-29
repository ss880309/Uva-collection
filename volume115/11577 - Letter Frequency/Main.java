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
		
			String s = new String("");
			while( (s = scanner.nextLine()).equals("") );
			
			s = s.toLowerCase();
			int[] a = new int[26];
			
			Arrays.fill(a,0);
			int max = Integer.MIN_VALUE;
			
			for(int j=0;j<s.length();j++)
			{
				if('a'<=s.charAt(j) && s.charAt(j)<='z')
				{
					a[s.charAt(j)-'a']++;
					max = Math.max(a[s.charAt(j)-'a'], max);
				}
			}
			//System.out.println(""+max);
			
			for(int j=0;j<a.length;j++)
			{
				if(a[j]==max)
				{
					System.out.print((char)(j+'a'));
				}
			}
			
			System.out.println();
			
		}
	}
}