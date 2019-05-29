import java.util.Scanner;
import static java.lang.Math.*;
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int ans=0;
			
			if( a==-1 && b==-1 )
				break;
			
			if(abs(a-b) > 50)
				ans = 100 - abs(a-b);
			else
				ans = abs(a-b);
			
			System.out.println(ans);
			
			
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
