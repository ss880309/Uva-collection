import java.util.Arrays;
import java.util.Scanner;
public class Main 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int n = scanner.nextInt();
			int[] a = new int[n];
					
			for(int i=0;i<n;i++)
				a[i] = scanner.nextInt();
			
			Arrays.sort(a);
			
			int mid = a[(n-1)/2];
			int Mid = a[n/2];
			int range = Mid-mid+1;
			
			int count = 0;
			for(int i=0;i<a.length;i++)
			{
				if( a[i]==mid || a[i]==Mid )
					count++;
			}

			System.out.println(mid+" "+count+" "+range);

		}
	}
}
