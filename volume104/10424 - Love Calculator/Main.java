import java.util.*;
public class Main
{
	public static double toOne(String s)
	{
		int one = 0;	
		for(int i=0;i<s.length();i++)
			one+=s.charAt(i)-'a'+1;
		while(one>9)
		{
			String t = Integer.toString(one);
			int sum = 0;
			for(int i=0;i<t.length();i++)
				sum+=t.charAt(i)-'0';
			one = sum;
		}
		return one;
	}
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(sc.hasNext())
        {
        	if(count++!=1)
        		System.out.println();
        	String s1 = sc.nextLine().toLowerCase();
        	String s2 = sc.nextLine().toLowerCase();
        	System.out.printf("%.2f %%",((Math.min(toOne(s1),toOne(s2))/Math.max(toOne(s1),toOne(s2)))*100));       	
        }
    }
}
