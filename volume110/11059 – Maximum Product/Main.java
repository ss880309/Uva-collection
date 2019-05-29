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
			int n = scanner.nextInt();
			int[] a = new int[n];
			
			for(int i=0 ; i<a.length ; i++)
			{
				a[i]=scanner.nextInt();
			}
			
			long max=0;
			for(int i=0 ; i<a.length ; i++)
			{
				long big=1;
				for(int j=i ; j<a.length ; j++)
				{
					big = big*a[j];
					max = Math.max(max , big);
				}
				
			}
			System.out.println("Case #"+(count++)+": The maximum product is "+max+".\n");
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
