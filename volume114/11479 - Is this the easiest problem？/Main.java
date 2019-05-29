import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			long c = scanner.nextLong();
			if(!( a+b>c && a+c>b && b+c>a ))
				System.out.println("Case "+i+": Invalid");
			else if( a==b && b==c && a==c )
				System.out.println("Case "+i+": Equilateral");
			else if( a==b || b==c || a==c )
				System.out.println("Case "+i+": Isosceles");
			else
				System.out.println("Case "+i+": Scalene");
		}
	}
}