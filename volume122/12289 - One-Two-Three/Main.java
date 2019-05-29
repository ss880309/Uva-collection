import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//直接暴力破解(枚舉法)	
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=0;i<n;i++)
		{
			
			String s = scanner.next();
			
			if(s.length()==3)
			{
				
				int one = 0;
				int two = 0;
				
				if(s.charAt(0)=='o')
					one++;
				if(s.charAt(1)=='n')
					one++;
				if(s.charAt(2)=='e')
					one++;
				
				if(s.charAt(0)=='t')
					two++;
				if(s.charAt(1)=='w')
					two++;
				if(s.charAt(2)=='o')
					two++;
				
				if(one>two)
				{
					System.out.println("1");
				}
				else
				{
					System.out.println("2");
				}
				
			}
			else if(s.length()==5)
			{
				System.out.println("3");
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
