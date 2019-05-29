import java.util.Scanner;
import static java.lang.Math.abs;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			int s = scanner.nextInt();
			int d = scanner.nextInt();
			
			if(s<d)
			{
				System.out.println("impossible");
			}
			else
			{
				int a = (s+d)/2;
				int b = a-d;
				if(a+b!=s)
					System.out.println("impossible");
				else
					System.out.println(a+" "+b);
			}
			
		}
	}
}