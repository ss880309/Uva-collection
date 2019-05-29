import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;
/*

Input:
18 1 17 1 15 1 
17 1 11 1 
11 1 29 1 9 1 
2 1 4 1 5 1 7 1 11 1 
18 1 23 1 29 1 
31 1 29 1 
2 3 11 2 25 1 
41 2 
51 1 5 1 
17 1 19 1 23 1 
0 

Output: 
353 1 13 1 
31 1 3 1 2 1 
41 1 7 1 5 1 2 1 
3079 1 
7 4 5 1 
449 1 2 1 
3457 1 7 1 
7 1 5 1 3 1 2 4 
127 1 2 1 
619 1 3 1 2 2 

*/

public class Main
{
	//static int[] prime = new int[32767+1];
	static ArrayList<Integer> prime = new ArrayList<Integer>();
	public static void main(String[] args) 
	{

		for(int i=32767+1;i>=2;i--)
		{
			boolean is = true;
			for(int j=2;j<=Math.sqrt(i);j++)
			{
				if(i%j==0)
				{
					is = false;
					break;
				}
			}
			if(is)
				prime.add(i);
		}
		//System.out.println(prime);
		
		sc sc = new sc(System.in);
		//Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String S = sc.nextLine();//17 1
			if(S.equals("0"))
				break;
			String[] s = S.split(" ");
			long sum = 1;
			for(int i=0;i<s.length;i+=2)
				sum *= Math.pow(Double.parseDouble(s[i]), Double.parseDouble(s[i+1]));
			sum--;
			int index = 0;
			//System.out.println(sum);
			
			StringBuilder sb = new StringBuilder("");
			while(true)
			{
				if(sum%prime.get(index)==0)
				{
					sb.append(prime.get(index)+" ");
					int count = 0;
					while(true)
					{
						sum/=prime.get(index);
						count++;
						if(sum%prime.get(index)!=0)
						{
							sb.append(count+" ");
							break;
						}
					}
					
				}
				
				if(prime.get(index)==2)
					break;
				index++;
			}
					
			System.out.println(sb.deleteCharAt(sb.length()-1));	
				
		}
	}
}



class sc implements Iterator<String>
{
	
	BufferedReader buffer;
	StringTokenizer token;
	
	public sc()
	{
		buffer = new BufferedReader(new InputStreamReader(System.in));
	}
	
	public sc(InputStream in)
	{
		buffer = new BufferedReader(new InputStreamReader(in));
	}
	
	@Override
	public boolean hasNext()
	{
		while(token == null || !token.hasMoreElements())
		{
			try
			{
				token = new StringTokenizer(buffer.readLine());
			}catch(IOException e)
			{
				return false;
			}
		}
		return true;
	}
	
	@Override
	public String next()
	{
		if(hasNext()) 
			return token.nextToken();
		return null;
	}

	@Override
	public void remove()
	{
		return;
	}

	String nextLine()
	{
		if(hasNext()) 
			return token.nextToken("\n");
		return null;
	}
	
	char nextChar()
	{
		return next().charAt(0);	
	}
	
	int nextInt()
	{
		return Integer.parseInt(next());
	}

	long nextLong()
	{
		return Long.parseLong(next());
	}
	
	double nextDouble()
	{
		return Double.parseDouble(next());
	}
	
	byte nextByte()
	{
		return Byte.parseByte(next());
	}
	
}




