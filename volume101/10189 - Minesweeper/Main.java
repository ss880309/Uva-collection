import java.util.Arrays;
import java.util.Scanner;


public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count =1;
		while(scanner.hasNext())
		{
	
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			
			if(a==0 && b==0)
				break;
			
			if(count!=1)
				System.out.println();
			
			char[][] c = new char[a+2][b+2];
			for(int i=0;i<a+2;i++)
			{
				for(int j=0;j<b+2;j++)
				{
					c[i][j] = '0';
				}
			}
			
			for(int i=0;i<a;i++)
			{
				String s = scanner.next();
				for(int j=0;j<s.length();j++)
				{
					if(s.charAt(j)=='*')
						c[i+1][j+1]='*';
				}
			}
			
			for(int i=1;i<a+1;i++)
			{
				for(int j=1;j<b+1;j++)
				{
					if(c[i][j]=='*')
					{
						if(c[i-1][j-1]!='*')
							c[i-1][j-1]++;
						
						if(c[i-1][j+1]!='*')
							c[i-1][j+1]++;
						
						if(c[i+1][j+1]!='*')
							c[i+1][j+1]++;
						
						if(c[i+1][j-1]!='*')
							c[i+1][j-1]++;
						
						if(c[i][j+1]!='*')
							c[i][j+1]++;
						
						if(c[i][j-1]!='*')
							c[i][j-1]++;
						
						if(c[i+1][j]!='*')
							c[i+1][j]++;
						
						if(c[i-1][j]!='*')
							c[i-1][j]++;
					}
					
				}
			}
			
			StringBuilder sb = new StringBuilder("Field #"+(count++)+":\r\n");
			
			for(int i=1;i<a+1;i++)
			{
				for(int j=1;j<b+1;j++)
				{
					
					sb.append(c[i][j]);
					
				}
				sb.append("\r\n");
			}
			
			System.out.print(sb);
			
			
			
		}
	}

}
