import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		while(scanner.hasNext())
		{
			
			long a = scanner.nextInt();
			long n = (a/2) + 1;
			long last = (n*n*2) - 1;
			
			System.out.println( last + (last-2) + (last-4) );
			
		}
	}
}