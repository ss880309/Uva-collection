import java.util.Arrays;
import java.util.Scanner;
public class Main 
{

	public static void main(String[] args)	
	{
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=0;i<num;i++)
		{
			
			int n = scanner.nextInt();
			int[] a = new int[n];
			
			for(int j=0;j<n;j++)
				a[j]=scanner.nextInt();
			
			Arrays.sort(a);
			
			int temp = n%2==0 ? a[(n+1)/2] : a[n/2] ;
			int result = 0;
			
			for(int j=0;j<n;j++)
				result += Math.abs(temp-a[j]);
			
			System.out.println(result);
			
		}
	}
}
