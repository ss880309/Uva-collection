
import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        HashMap m = new HashMap<String,String>();
        while(sc.hasNext())
        {
        	try
        	{
	        	String T = sc.nextLine();
	        	String[] t = T.split(" ");
	        	m.put(t[1],t[0]);
			}catch(Exception ex)
			{
				break;
			}
        }
        
        while(sc.hasNext())
        {
        	String s = sc.next();
        	if(m.containsKey(s))
        		System.out.println(m.get(s));
        	else
        		System.out.println("eh");	
        }
        
    }
};

