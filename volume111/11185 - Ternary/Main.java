import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			
			int n = scanner.nextInt();
			if(n < 0)
				break;
			
			StringBuilder sb = new StringBuilder("");
	
			if(n==0)
			{
				System.out.println(0);
				continue;
			}
			
			while(n!=0)
			{
				sb.append(n%3);
				n/=3;
			}
			
			System.out.println(sb.reverse());
			
		}
	}
}