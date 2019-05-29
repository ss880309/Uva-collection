import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;


public class Main 
{    
    
	
    public static void main(String[] args) 
    {
        //sc sc = new sc(System.in);
    	Scanner sc = new Scanner(System.in);
    	while(sc.hasNext())
    	{
    		int a = sc.nextInt();
    		int b = sc.nextInt();
    		int[][] n = new int[a][b];
    		int[][] dp = new int[a][b];
    		int[][] path = new int[a][b];
    		for(int i=0;i<a;i++)
    		{
    			for(int j=0;j<b;j++)
    			{
    				n[i][j] = sc.nextInt();
    				dp[i][j] = n[i][j];
    			}
    		}
    		
    		for( int j = b-2 ; j >= 0 ; j-- )
    	    {
    	      for( int i = 0 ; i < a ; i++ )
    	      {
    				int up   = n[i][j] + dp[((i-1)+a)%a][j+1];
    				int mid  = n[i][j] + dp[i][j+1]; 
    				int down = n[i][j] + dp[(i+1)%a][j+1];
    				
    				if(up<=mid && up<=down)
    				{
    					dp[i][j] = up;
    					path[i][j] = (i-1+a)%a;
    				}
    				
    				if(mid<=up && mid<=down)
    				{
    					dp[i][j] = mid;
    					path[i][j] = i;
    				}
    				
    				if(down<=up && down<=mid)
    				{
    					dp[i][j] = down;
    					path[i][j] = (i+1)%a;
    				}
    				
    			}
    		}
    		
    		
    		int minpath = Integer.MAX_VALUE;
    		int mini = -1;
    		
    		for(int i=0;i<a;i++)
    		{
    			//System.out.println(Arrays.toString(dp[i]));
    			if(dp[i][0]<minpath)
    			{
    				minpath = dp[i][0];
    				mini = i;
    				
    			}
    		}
    		
    		int next = mini;
    	    System.out.printf("%d", mini+1);
    	    for( int i = 0 ; i < b-1 ; i++ )
    	    {
    	    	System.out.printf(" %d", path[next][i]+1);
    	        next = path[next][i];
    	    }
    	    System.out.printf("\n%d\n", dp[mini][0]);
    		
    	}
    }        
}
