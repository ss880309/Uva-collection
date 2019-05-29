import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
        	int n = sc.nextInt();
        	int k = sc.nextInt();
        	int sum = n+n/k;
        	int temp = n%k;
        	while(n>k)
        	{
        		n = n/k+temp;
        		temp = n%k;
        		sum+=n/k;
        	}  	   	
        	System.out.println(sum);      	
        } 
    }
}
