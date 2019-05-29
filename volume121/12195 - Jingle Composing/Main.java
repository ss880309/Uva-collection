import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//很直接的題目
		double W =1.0;
		double H =1.0/2.0;
		double Q =1.0/4.0;
		double E =1.0/8.0;
		double S =1.0/16.0;
		double T =1.0/32.0;
		double X =1.0/64.0;
		
		while(scanner.hasNext())
		{
			String s = scanner.next();
			if(s.charAt(0)=='*')
				break;
			
			int ans=0;
			double count = 0.0;
			for(int i=1;i<s.length()-1;i++)
			{
				
				if(s.charAt(i)=='W')
					count+=W;
				else if(s.charAt(i)=='H')
					count+=H;
				else if(s.charAt(i)=='Q')
					count+=Q;
				else if(s.charAt(i)=='E')
					count+=E;
				else if(s.charAt(i)=='S')
					count+=S;
				else if(s.charAt(i)=='T')
					count+=T;
				else if(s.charAt(i)=='X')
					count+=X;
				
				if(s.charAt(i+1)=='/')
				{
					if(count==1.0)
						ans++;
					count=0.0;
				}
			}
			
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
