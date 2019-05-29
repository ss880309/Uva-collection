import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0;i<n;i++)
		{	
			
			StringBuilder s = new StringBuilder(scanner.next());
			int count = 1;
			
			while(true)
			{
				StringBuilder result = new StringBuilder(Long.toString((Long.parseLong(s.toString()) + Long.parseLong(s.reverse().toString()))));
				
				//最好不要直接用s去比較
				if(Long.parseLong(result.toString()) == Long.parseLong(result.reverse().toString()))
				{
					System.out.println(count+" "+result);
					break;
				}
				s.delete(0, s.length()).append(result);
				count++;
			}
			
		}
	}
}