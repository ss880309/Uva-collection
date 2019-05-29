import java.util.*;
public class main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] n = new int[26];
        int max = -999;
        while(N-->-1)
        {
        	String s = sc.nextLine().toUpperCase();
        	for(int i=0;i<s.length();i++)
        	{
        		if(Character.isLetter(s.charAt(i)))
        		{
					n[s.charAt(i)-'A']++;
        			max = Math.max(max,n[s.charAt(i)-'A']);
        		}
        	}	
        }
        
        for(int i=max;i>=1;i--)
        {
        	for(int j=0;j<n.length;j++)
        	{
        		if(n[j]==i)
        			System.out.println((char)(j+'A')+" "+i);
        	}
        }
          
    }
}
