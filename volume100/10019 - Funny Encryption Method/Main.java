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
			
			int M=scanner.nextInt();//265
			int b1=0;
			int b2=0;
			String x1=Integer.toBinaryString(M);
			String x2=Integer.toBinaryString(Integer.parseInt(Integer.toString(M),16));
			
			
			for(int j=0;j<x1.length();j++)//x1
			{
				if(x1.charAt(j)=='1')
					b1++;
			}
			
			for(int k=0;k<x2.length();k++)//x2
			{
				if(x2.charAt(k)=='1')
					b2++;
			}
			
			System.out.println(b1+" "+b2);
			
		}
	}
}