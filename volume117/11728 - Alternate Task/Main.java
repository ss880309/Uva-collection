import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
    	//102
    	//1 101
        Scanner sc = new Scanner(System.in);
        HashMap m = new HashMap<Integer,Integer>();
        for(int i=1;i<=1000;i++)
        {
        	int sum = 0;
        	for(int j=1;j<=i;j++)
        	{
        		if(i%j==0)
        			sum+=j;
        	}
        	m.put(sum,i);
        }
        int count = 1;
        while(sc.hasNext())
        {
        	int n = sc.nextInt();
        	if(n==0)
        		break;
        	System.out.println("Case "+(count++)+": "+(m.containsKey(n)?m.get(n):"-1"));
        }
    }
}
