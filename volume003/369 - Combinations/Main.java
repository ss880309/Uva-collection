import java.math.BigInteger;
import java.util.Scanner;



//using pacal triangel


public class Main 
{
	
	public static BigInteger[][] init(BigInteger[][] a,int m,int n)
	{
		for(int i=0;i<=m;i++)
			for(int j=0;j<=m;j++)	
				a[i][j] = BigInteger.ZERO;
				
		for(int i=0;i<=m;i++)
		{
			a[i][i] = BigInteger.ONE;
			a[i][0] = BigInteger.ONE;
		}
		return a;
	}
	
	
	public static BigInteger ans(BigInteger[][] a,int m,int n)
	{
		for(int i=1;i<=m;i++)
			for(int j=1;j<=m;j++)	
				a[i][j] = a[i-1][j-1].add(a[i-1][j]);
		return a[m][n];
	}
	
	

	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);		
		while(sc.hasNext())
		{
			int m = sc.nextInt();
			int n = sc.nextInt();
			if(m==0 && n==0)
				break;
			BigInteger[][] a = new BigInteger[m+1][m+1];
			a = init(a,m,n);
			System.out.println(m+" things taken "+n+" at a time is "+ans(a,m,n)+" exactly.");	
		}
	}
	
}
