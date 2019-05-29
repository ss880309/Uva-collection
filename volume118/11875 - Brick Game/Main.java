import java.util.PriorityQueue;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//new BigInteger("") ~=  BigInteger.valueOf()   用哪個都可以 
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int count = 1;
		for(int i=0;i<a;i++)
		{
			
			int b = scanner.nextInt();
			int[] c = new int[b];
			
			for(int j=0;j<b;j++)
				c[j]=scanner.nextInt();
			
			System.out.println("Case "+(count++)+": "+c[b/2]);
			
		}
	}
}