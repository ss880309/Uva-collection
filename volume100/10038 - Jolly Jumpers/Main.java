import java.util.HashSet;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		//注意  不可以重複  and 1 ~ n-1
		while (scanner.hasNext()) 
		{	
					
			int n = scanner.nextInt();
			int[] a = new int[n];
			
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();

			HashSet<Integer> hs = new HashSet<Integer>();

			for(int i=0 ; i < n-1 ; i++)// carefore OutOfBound
			{
				if( 1 <= Math.abs(a[i]-a[i+1]) && Math.abs(a[i]-a[i+1]) <= n-1 )
					hs.add(Math.abs(a[i]-a[i+1]));
			}
			
			System.out.println( hs.size() == n-1 ? "Jolly" : "Not jolly" );
			
		}
	}
}