import java.math.BigInteger;
import java.util.Scanner;
public class Main 
{

	public static void main(String[] args)	
	{
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		for(int i=0;i<n1;i++)
		{
			
			int n2 = scanner.nextInt();
			int[] a = new int[n2];
			int[] b = new int[n2];
			for(int j=0;j<n2;j++)
			{
				a[j] = scanner.nextInt();
				b[j] = scanner.nextInt();	
			}
			BigInteger n = BigInteger.valueOf(a[0]).add(BigInteger.valueOf(b[0]));
			
			for(int j=1;j<n2;j++)
			{
				n = n.multiply(BigInteger.valueOf(10));
				n = n.add(BigInteger.valueOf(a[j]).add(BigInteger.valueOf(b[j])));
			}
			
			System.out.println(n);
			
			if(i!=(n1-1))
				System.out.println();
			
		}
	}
}