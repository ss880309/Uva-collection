import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		while(scanner.hasNext())
		{	
			int n = scanner.nextInt();
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			if( n==0 && a==0 && b==0 && c==0 )
				break;
			
			int count = 2*360 + 1*360 ;
			
			count += ((n-a < 0) ? (n-a+40)*9 : (n-a)*9) + ((b-a < 0) ? (b-a+40)*9 : (b-a)*9) + ((b-c < 0) ? (b-c+40)*9 : (b-c)*9);
			
			System.out.println(count);
			
		}
	}
}