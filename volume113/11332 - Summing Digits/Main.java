import java.util.Scanner;
import java.lang.*;
public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int n=scanner.nextInt();//47
			//StringBuilder sb = new StringBuilder(Integer.toString(n));
			if(n==0)
			{
				System.out.println("break");
				break;
			}
			else if(n>9)//47
			{
				
				int sum=0;
				String s=Integer.toString(n);//47
				while(s.length()!=1)
				{
					for(int j=0;j<s.length();j++)
					{
						System.out.println(s.charAt(j));
						sum+=(int)(s.charAt(j)-'0');
						System.out.println(sum);
					}//sum=11
					s=Integer.toString(sum);
					System.out.println("done");
				}
				System.out.println(sum);
			}
			else if(10>n && n>0)
			{
				System.out.println(n);
			}else
			{
				System.out.println("nothing");
			}
		}
		 
	}
}
/*
For example, consider n = 1234567892 
Then:
f(n) = 1+2+3+4+5+6+7+8+9+2 = 47
f(f(n)) = 4+7 = 11
f(f(f(n))) = 1+1 = 2
Therefore, g(1234567892) = 2
 */
 