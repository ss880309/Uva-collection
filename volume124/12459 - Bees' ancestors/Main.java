import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		long[] n = new long[81];
		n[0] = 1;
		n[1] = 1;
		for(int i=2;i<n.length;i++)
		{
			n[i]=n[i-1]+n[i-2];
		}
		
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			
			int a = scanner.nextInt();
			if(a==0)
				break;
			System.out.println(n[a]);
			
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
