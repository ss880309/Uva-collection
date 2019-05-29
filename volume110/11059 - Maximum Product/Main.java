import java.util.*;
import java.math.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(sc.hasNext())
        {
        	int N = sc.nextInt();
        	int[] n = new int[N];
        	
        	for(int i=0;i<n.length;i++)
        		n[i] = sc.nextInt();
        	
        	long max = 0;
        	for(int i=0;i<n.length;i++)
        	{
        		
        		for(int j=i;j<n.length;j++)
        		{
        			long sum = 1;
        			for(int k=i;k<=j;k++)
        				sum*=n[k];
        			max = Math.max(max,sum);
        		}
        		
        	}
        	
        	System.out.println("Case #"+(count++)+": The maximum product is "+max+".\r\n");
        	
        }
        	
    }
}
