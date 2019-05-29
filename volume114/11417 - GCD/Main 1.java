import java.util.*;
import java.math.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
        	int n = scanner.nextInt();
        	if(n==0)
        		break;
        	BigInteger g = BigInteger.ZERO;
        	for(int i=1;i<n;i++)
        	{
        		for(int j=i+1;j<=n;j++)
        		{
        			g = g.add(gcd(i,j));
        		}
        	}
        	
        	System.out.println(g);
        	
        }
        
    }
    
    public static BigInteger gcd(int a,int b)
    {
    	return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b));
    }
    
}
