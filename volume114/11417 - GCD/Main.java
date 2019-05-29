import java.util.Scanner;
public class Main 
{
	public static int gcd(int a,int b)
	{
		int min=Math.min(a, b);
		int ans=1;
		for(int i=min;i>1;i--)
		{
			if( a%i==0 && b%i==0 )
			{
				ans=i;
				break;
			}
		}
		return ans;
	}
	
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		while(scanner.hasNext())
		{
			int a=scanner.nextInt();//10
			
			if(a==0)
				break;
			
			int sum=0;
			for(int i=1;i<a;i++)//a=N
			{
				for (int j=i+1;j<=a;j++)
				{
					sum+=gcd(i, j);
				}
			}
			System.out.println(sum);
		}
		
	}
	
}









