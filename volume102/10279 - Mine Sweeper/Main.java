import java.util.*;
public class Main
{
	public static char add1(char c)
	{
		if(c=='.')
			return c;
		else
			return (char)(c+1);
	}
	
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        for(int k=0;k<count;k++)
        {
        	if(k!=0)
        		System.out.println();
        		
        	int N = sc.nextInt();
        	String[] a = new String[N];
        	String[] b = new String[N];
        	char[][] c = new char[N+2][N+2];
        	
        	for(int i=0;i<N;i++)
        			a[i] = sc.next();
        	for(int i=0;i<N;i++)
        			b[i] = sc.next();
        	for(int i=0;i<N;i++)
        	{
        		for(int j=0;j<N;j++)
        		{
        			if(b[i].charAt(j)=='x')
        				c[i+1][j+1] = '0';
        			else
        				c[i+1][j+1] = '.';
        		}
        	}
        	
        	for(int i=0;i<N;i++)
        	{
        		for(int j=0;j<N;j++)
        		{
        			try{
	        			if(a[i].charAt(j)=='*')
	        			{ 
	        				         				 
	        				 c[i+1+1][j+1+1] = add1(c[i+1+1][j+1+1]);
	        				 c[i-1+1][j-1+1] = add1(c[i-1+1][j-1+1]);
	        				 c[i+1+1][j-1+1] = add1(c[i+1+1][j-1+1]);
	        				 c[i-1+1][j+1+1] = add1(c[i-1+1][j+1+1]);
	        				 
	        				 c[i+1+1][j+1] = add1(c[i+1+1][j+1]);
	        				 c[i-1+1][j+1] = add1(c[i-1+1][j+1]);
	        				 c[i+1][j+1+1] = add1(c[i+1][j+1+1]);
	        				 c[i+1][j-1+1] = add1(c[i+1][j-1+1]);
	        				 
	        			}
        			}catch(Exception ex)
        			{
        				
        			}
        			
        		}
        	}	
        	StringBuilder sb = new StringBuilder("");
        	for(int i=1;i<N+1;i++)
        	{
        		for(int j=1;j<N+1;j++)
	        		sb.append(c[i][j]);
	        	if(i!=N)
	        		sb.append("\r\n");
        	}
        		System.out.print(sb);			
        }
    }
}
