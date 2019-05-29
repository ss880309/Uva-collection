import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main 
{
	public static long sorta(char[] array)
	{
		long sum = array[array.length-1]-'0';
		for(int i=array.length-2;i>=0;i--)
		{
			sum *= 10;
			sum += (array[i]-'0');
		}
		return sum;
	}
	
	public static long sortb(char[] array)
	{
		return Long.parseLong(String.valueOf(array));
	}
	
	/*
	public static long sorta(String s)
	{
		char[] a = s.toCharArray();
		Arrays.sort(a);
		//List<char[]> list = Arrays.asList(a);
		//Collections.reverse(list);
		//return Long.parseLong(String.valueOf(list.toArray()));
		return Long.parseLong(new StringBuilder(String.valueOf(a)).reverse().toString());
	}
	
	public static long sortb(String s)
	{
		char[] a = s.toCharArray();
		Arrays.sort(a);
		return Long.parseLong(String.valueOf(a));
	}
	*/
	public static void main(String[] args) throws IOException	
	{
		//Scanner scanner = new Scanner(System.in);		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		long a,b,count,temp;
		String s;
		StringBuilder sb;
		
		//while(scanner.hasNext())
		while((s = r.readLine())!=null)
		{
			
			//s = scanner.next();
			if(s.equals("0"))
				break;
			
			sb = new StringBuilder("Original number was "+s+"\n");
			
			count = 0;
			temp = 0;
			while(true)
			{
				char[] array = s.toCharArray();
				Arrays.sort(array);
				a = sorta(array);
				b = sortb(array);
				count++;
				if(a-b!=temp)
				{
					temp = a-b;
					sb.append(a+" - "+b+" = "+temp+"\n");
					s = Long.toString(temp);	
				}
				else 
				{
					sb.append(a+" - "+b+" = "+temp+"\n");
					sb.append("Chain length "+count+"\n");
					break;
				}
				
			}
			
			System.out.print(sb);
			
		}
	}
}