import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			
			int a = scanner.nextInt();//5
			int b = scanner.nextInt();//3
			int[] c = new int[a+1];//0 1 2 3 4 5 space:6
			
			for(int i=0;i<b;i++)
			{
				int n = scanner.nextInt();//3 1 5
				c[n]=1;
			}
		
			int count=0;
			for(int i=1;i<=a;i++)
			{
				if(c[i]==0)
				{
					count++;
					System.out.printf("%d ", i);
				}
				
			}
			
			if(count==0)
				System.out.printf("*");
			System.out.println();
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
