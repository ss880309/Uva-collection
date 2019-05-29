import java.util.Scanner;
import java.math.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			int a=scanner.nextInt();
			String s = Integer.toBinaryString(a);
			int b1=0;
			int b2=0;
			for(int j=0;j<s.length();j++)
			{
				if((s.charAt(j)-'0')==1)
					b1++;
			}
			s = Integer.toString(a);
			for(int j=0;j<s.length();j++)
			{
				String t = Integer.toBinaryString(s.charAt(j)-'0');
				for(int k=0;k<t.length();k++)
				{
					if((t.charAt(k)-'0')==1)
						b2++;
				}
			}
			System.out.println(b1+" "+b2);
			/*
			for(int j=0;j<s.length();j++)
			{
				String ss = Integer.toBinaryString(a.charAt(j));
				for(int j=0;j<s.length();j++)
				{
					if((s.charAt(j)-'0')==1)
						b2++;
				}
			}
			*/
			
		}
		
	}
}