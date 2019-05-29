import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int count = 1;
		while(scanner.hasNext())
		{
			int n = scanner.nextInt();
			
			if(n==0)
				break;
			
			int[] a = new int[n];
			int sum = 0;
			
			for(int i=0;i<a.length;i++)
			{
				a[i] = scanner.nextInt();
				sum += a[i];
			}
			
			int aver = sum / n;
			int ans = 0;
			
			for(int i=0;i<a.length;i++)
			{
				if((a[i]-aver) > -1)
					ans += (a[i]-aver); 
			}
			
			System.out.println("Set #"+(count++));
			System.out.println("The minimum number of moves is "+ans+".\n");
			
		}
	}
}