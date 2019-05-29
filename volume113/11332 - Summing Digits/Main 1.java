import java.util.Scanner;
public class Main 
{
	public static int f(int n)
	{
		int sum=0;
		while( n!=0 )
		{
			sum += n%10;
			n = n/10;
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			int n = scanner.nextInt();
			
			if(n==0)	
				break;
			
			while(!( 0<n && n<10 ) )
				n = f(n);
			
			System.out.println(n);
			
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
