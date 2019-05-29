import java.util.Scanner;

public class Main 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count = 1;
		while(scanner.hasNext())
		{
			String s = scanner.next();
			int n = scanner.nextInt();
			System.out.println("Case "+(count++)+":");
			
			for(int i=0;i<n;i++)
			{
				int from = scanner.nextInt();
				int to = scanner.nextInt();
				
				if(from > to)//swap
				{
					int temp = from;
					from=to;
					to=temp;
				}

				char t = s.charAt(from);
				int j;
				int yes=1;
				for(j=from+1;j<to+1;j++)
				{
					if(t!=s.charAt(j))
					{
						yes=0;
						break;
					}	
				}
				
				if(yes==1)
					System.out.println("Yes");		
				else
					System.out.println("No");
				
			}
		}
	}
}

/*
import java.util.Scanner;
//11636 - Hello World!
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count=1;
		while(scanner.hasNext())
		{
			
			int a = scanner.nextInt();
			if(a==-1)	break;
			int result = (int) Math.ceil(Math.log(a)/Math.log(2)) ;
			//int result = (int) Math.ceil(Math.log(a)/Math.log(2));
			System.out.println("Case "+(count++)+": "+result);
			//System.out.println(String.format("Case %d: %d\n", count++,result));
			//String.format("Case %d: %d\n", count++,ans)
		}
	}
}
 */
