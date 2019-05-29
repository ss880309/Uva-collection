import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.StringTokenizer;

class number implements Comparable<number>
{
	int i = 0;
	void get(int n)
	{
		this.i = n;
	}
	
	number(int n)
	{
		get(n);
	}
	
	@Override
	public int compareTo(number o1) 
	{
		// TODO Auto-generated method stub
		return Math.abs(this.i)>Math.abs(o1.i)?1:-1;
	}
	public String toString()
	{
		return Integer.toString(i);
	}
	
}


public class Main
{

	 
	public static void main(String[] args) 
	{
		
		
		//Scanner sc = new Scanner(System.in);
		sc sc = new sc(new BufferedInputStream(System.in));
		int N = sc.nextInt();
		for(int i=0;i<N;i++)
		{
			int M = sc.nextInt();
			Integer[] n = new Integer[M];
			//number[] n = new number[M];
			for(int j=0;j<M;j++)
			{
				n[j] = sc.nextInt();
				//n[j] = new number(sc.nextInt());
			}	
			Arrays.sort(n,
							new Comparator<Integer>()
							{
								@Override
								public int compare(Integer a,Integer b) 
								{
									// TODO Auto-generated method stub
									return Integer.valueOf(Math.abs(a)).compareTo(Math.abs(b));
								}
							}
						);
			//System.out.println(Arrays.toString(n));
			int count = 1;
			for(int j=0;j<M-1;j++)
			{
				if( (n[j]>0 && n[j+1]<0) || (n[j]<0 && n[j+1]>0) )
					count++;
			}
			System.out.println(count);
			
		}
		
		
		
		/*
		int t = sc.nextInt();
		for(int T=0;T<t;T++)
		{
			int N = sc.nextInt();//10
			int M = sc.nextInt();//10
			//int[] n = new int[N];
			LinkedList<Long> n = new LinkedList<Long>();
			for(int i=0;i<N;i++)
				n.add(sc.nextLong());
				//n[i] = sc.nextInt();//7 7 3 3 5 9 9 8 1 8 
			
			for(int i=0;i<M;i++)
			{
				String S = sc.nextLine();
				String[] s = S.split(" ");
				int a = Integer.parseInt(s[1]);
				int b = Integer.parseInt(s[2]);
				if(s[0].equals("Q"))
				{
					LinkedList<Long> temp = new LinkedList<Long>();
					for(int j=a;j<=b;j++)
					{
						temp.add(n.get(j));
					}
					System.out.println(temp);
					System.out.println(Collections.max(temp));
				}
				else if(s[0].equals("U"))
				{
					n.remove(a);
					n.add(a, (long) b);
				}
			
			
			}	
			
		}	
		*/	
			
			
			
		/*	
		try
		{
			int N = sc.nextInt();//10
			int Q = sc.nextInt();//5
			int[] n = new int[N];
			
			for(int i=0;i<N;i++)
				n[i] = sc.nextInt();//1~10
			
			for(int i=0;i<Q;i++)
			{
				String S = sc.nextLine();
				String[] s = S.split(" ");
				int a = Integer.parseInt(s[1]);
				int b = Integer.parseInt(s[2]);
				if(s[0].equals("Q"))
				{
					long sum = 0;
					for(int j=a;j<=b;j++)
					{
						sum+=n[j-1];
					}
					System.out.println(sum);
				}
				else if(s[0].equals("C"))
				{
					int c = Integer.parseInt(s[3]);
					for(int j=a;j<=b;j++)
					{
						n[j-1]+=c;
					}
				}
			}
			
		}catch(Exception ex)
		{
			
		}
		*/
			
			
		
		
		/*
		HashMap<Integer,BigInteger> t = new HashMap<Integer,BigInteger>();
		//int N = sc.nextInt();
		BigInteger N = sc.nextBigInteger();
		//for(int i=0;i<N;i++)
		for(BigInteger i = BigInteger.ZERO;i.compareTo(N)<0;i=i.add(BigInteger.ONE))
		{
			
			int n = sc.nextInt();
			//System.out.println(BigInteger.valueOf(n).pow(4).subtract(BigInteger.valueOf(6).multiply(BigInteger.valueOf(n).pow(3))).add(BigInteger.valueOf(23).multiply(BigInteger.valueOf(n).pow(2))).subtract(BigInteger.valueOf(18).multiply(BigInteger.valueOf(n))).divide(BigInteger.valueOf(24)).add(BigInteger.ONE));
			
			if(t.containsKey(n))
				System.out.println(t.get(n));
			else
			{
				t.put( n,BigInteger.valueOf(n).pow(4).subtract(BigInteger.valueOf(6).multiply(BigInteger.valueOf(n).pow(3))).add(BigInteger.valueOf(23).multiply(BigInteger.valueOf(n).pow(2))).subtract(BigInteger.valueOf(18).multiply(BigInteger.valueOf(n))).divide(BigInteger.valueOf(24)).add(BigInteger.ONE) );
				System.out.println(t.get(n));
			}
			
		}
		*/
		
		
		
		/*
		sc sc = new sc(new BufferedInputStream(System.in));
		
		while(sc.hasNext())
		{
			
			
			
			
			
			int X = sc.nextInt();
			int Y = sc.nextInt();
			String R = sc.next();
			if(R.charAt(0)=='-')
				break;
			double r = Double.parseDouble(R);

			int n = sc.nextInt();
			int[] x = new int[n];
			int[] y = new int[n];
			for(int i=0;i<n;i++)
			{
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}
			
			
			ArrayList<vector> p = new ArrayList<vector>();
			for(int i=0;i<n;i++)
			{
				double temp = Math.sqrt((X-x[i])*(X-x[i])+(Y-y[i])*(Y-y[i]));
				if(r>=temp)
					p.add(new vector(x[i]-X,y[i]-Y));
			}
			
			System.out.println(p.toString());
			
			int max = 0;
			for(int i=0;i<p.size();i++)
			{
				int countA = 0;
				int countB = 0;
				for(int j=0;j<p.size();j++)
				{
					int temp = p.get(i).x*p.get(j).y - p.get(i).y*p.get(j).x;
					//System.out.println(temp);
					if(temp>=0)
						countA++;
					else
						countB++;
				}
				
				max = Math.max(max, countA>countB?countA:countB);
			}
			
			System.out.println(max);
			
		}
		*/
		/*
		sc sc = new sc(new BufferedInputStream(System.in));
		while(sc.hasNext())
		{
			int N = sc.nextInt();
			
			
			
			
			
		}
		*/
		
		
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




