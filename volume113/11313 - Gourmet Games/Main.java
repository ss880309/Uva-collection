import java.util.Scanner;
public class Main 
{	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		for(int i=0;i<num;i++)
		{

			int n = scanner.nextInt();
			int m = scanner.nextInt();
			int ans = 0;
			
			while(n>=m)
			{
	            n -= m;
	            n++;    
	            ans++;
	        }
			
			System.out.println(n==1?ans:"cannot do this");
			
		}
	}
}