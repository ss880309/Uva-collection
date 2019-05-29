import java.util.*;
public class main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);    
        while(sc.hasNext())
        {
        	int from = sc.nextInt();
        	int to   = sc.nextInt();
        	if(from==0&&to==0)
        		break;
        	int count = 0;
        	for(int i=from;i<=to;i++)
        	{	
        		double sum = Math.sqrt(i);
        		sum-=(long)sum;
        		if(sum==0.0)        		
        			count++;
        	}
        	System.out.println(count);	
        } 
    }
}
