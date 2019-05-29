import java.util.Scanner;
public class Main 
{	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			
			long s = scanner.nextLong();
			long d = scanner.nextLong();
			
			for(long i = s,sum = 0 ; ; i++)
			{
				sum+=i;
				
				if(sum>=d)
				{
					System.out.println(i);
					break;
				}
				
			}
			
		}
	}
}