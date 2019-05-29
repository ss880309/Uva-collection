import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int n = scanner.nextInt();
			
			int s = 0;
			
			for( int i=0 ;  ; i++ )
			{
				s += i;
				if(s>=n)
				{
					System.out.println("TERM "+n+" IS "+ ( i%2==1 ? (s-n+1)+"/"+(i-s+n) : (i-s+n)+"/"+(s-n+1) ) );
					break;
				}
			}
			
		}
	}
}