import java.math.BigInteger;
import java.util.Scanner;
public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		for(int i=0;i<n;i++)//2
		{
			System.out.println();
			
			StringBuilder x = new StringBuilder("");
			StringBuilder y = new StringBuilder("");
			int a = 0;
			int b = 0;
			BigInteger A = new BigInteger("0"); 
			BigInteger B = new BigInteger("0");
			int m=scanner.nextInt();
			for(int j=0;j<m;j++)//4
			{
				a=scanner.nextInt();
				b=scanner.nextInt();
				x.append(a);
				y.append(b);
			}
			
			//System.out.println(x);
			//System.out.println(y);
			
			int carry=0;
			StringBuilder ans = new StringBuilder("");
			for(int k=x.length()-1;k>-1;k--)
			{
				int temp=((x.charAt(k)-'0')+(y.charAt(k)-'0'))+carry;
				//System.out.println(temp+"--------");
				if(temp>9)
				{
					ans.append(temp-10);
					//System.out.println(ans);
					carry=1;
				}
				else
				{
					ans.append(temp);
					//System.out.println(ans);
					carry=0;
				}
			}
			System.out.println(ans.reverse());
			
			/*
			int maxlen = x.length();
			int carry=0;
			if(maxlen<y.length())
				maxlen=y.length();
			StringBuilder ans = new StringBuilder("");
			
			for(int k=maxlen-1;k>=0;k--)
			{
				int temp=((int)(x.charAt(k)-'0'))+((int)(y.charAt(k)-'0'))+carry;
				if(temp>9)
				{
					ans.append(temp-9);
					carry=1;
				}
				else
				{
					ans.append(temp);
					carry=0;
				}
				System.out.println(ans);
			}
			System.out.println(ans);
			*/
			/*
			System.out.println(x);
			System.out.println(y);
			System.out.println(BigInteger.valueOf(Integer.parseInt(x.toString())));
			System.out.println(BigInteger.valueOf(Integer.parseInt(y.toString())));
			A.add(BigInteger.valueOf(Integer.parseInt(x.toString())));
			B.add(BigInteger.valueOf(Integer.parseInt(y.toString())));
			System.out.println(A.toString());
			System.out.println(B.toString());
			System.out.println(A.add(B).toString());
			*/	
		}
	}

}
