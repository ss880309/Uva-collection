import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String[] s = new String[100];
        int maxline = 0;
        int maxlen = 0;
        while(sc.hasNext())
        {
        	s[maxline] = sc.nextLine();
        	maxlen = Math.max(maxlen,s[maxline].length());
        	maxline++;
        }
        
        StringBuilder sb = new StringBuilder("");
        
        for(int i=0;i<maxlen;i++)
        {
        	for(int j=maxline-1;j>=0;j--)
        	{
        		try
        		{
        			sb.append(s[j].charAt(i));
        		}catch(Exception ex)
        		{
        			if(j>1)
        				sb.append(" ");
        		}
        	}
        	
        	sb.append("\r\n");
        	
        }
        
        System.out.print(sb);
        
    }
}
