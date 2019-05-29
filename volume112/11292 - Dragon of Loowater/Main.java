import java.util.Arrays;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args)	
	{
		//�t�I�N�W�ɤF...
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int n = scanner.nextInt();
			int m = scanner.nextInt();
			if(n==0 && m==0)
				break;
			int[] a = new int[n];
			int[] b = new int[m];
			
			for(int i=0;i<n;i++)
				a[i]=scanner.nextInt();
			
			for(int i=0;i<m;i++)
				b[i]=scanner.nextInt();
			
			Arrays.sort(a,0,n);
			Arrays.sort(b,0,m);
			
			int count = 0;
			int sum = 0;
			
			for(int i=0;i<m;i++)
			{
				if(b[i]>=a[count])
				{	
					sum += b[i];
					if(++count == n)
						break;
				}
			}
			
			if(count<n)
				System.out.println("Loowater is doomed!");
			else
				System.out.println(sum);
			
		}
	}
}

