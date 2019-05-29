import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			
			int n = scanner.nextInt();
			if(n==0)
				break;
			
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			for(int i=0;i<n;i++)
			{
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				
				if(a==x || b==y)
					System.out.println("divisa");
				else if(a>x && b>y)
					System.out.println("NE");
				else if(a<x && b>y)
					System.out.println("NO");
				else if(a<x && b<y)
					System.out.println("SO");
				else if(a>x && b<y)
					System.out.println("SE");
				
			}
		}
	}
}