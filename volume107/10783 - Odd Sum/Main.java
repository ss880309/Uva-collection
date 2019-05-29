import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);	
		int n = scanner.nextInt();

		for(int i=1;i<=n;i++)
		{
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			if( a%2!=1 )
				a+=1;
			if( b%2!=1 )
				b-=1;
			
			int sum = 0;
			
			for(int j=a ; j<=b ; j+=2)
				sum += j;		
				
			System.out.println("Case "+i+": "+sum);
	
		}
	}
}