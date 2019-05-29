import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main
{
	//static int[] prime = new int[32767+1];
	
	public static void main(String[] args) 
	{
		
		//System.out.println(prime);
		
		sc sc = new sc(System.in);
		//Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext())
		{
			int m = 1;
			int i = 0;
			int N = sc.nextInt();
			if(N==0)
				break;
			LinkedList<Integer> n = new LinkedList<Integer>();
			for(int i=1;i<=N;i++)
				n.add(i);
			while(true)
			{
				if(n.size()==1)
				{
					if(n.get(0)==13)
					{
						System.out.println(m);
						break;
					}
					else
					{
						m++;
						 n = new LinkedList<Integer>();
						 for(int j=1;j<=N;j++)
								n.add(j);
						 i = 0;
						continue;
					}
				}		
				n.remove(i);
				i = ( i + m - 1 ) % n.size();	
			}
			
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




