import java.util.Scanner;
public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner  = new Scanner(System.in);
		while(scanner.hasNext())
		{
		
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int sum = n;
			
			while(n>=k)
			{
				sum += n/k;
				n=(n/k)+(n%k);
			}
			
			System.out.println(sum);
		
		}
	}
}
