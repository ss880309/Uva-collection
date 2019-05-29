import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String enter = sc.nextLine();
        for(int i=0;i<N;i++)
        {
        	if(i!=0)
        		System.out.println();
        	TreeMap<String,Double> m = new TreeMap<String,Double>();
        	double total = 0;
        	for(int t = 0;sc.hasNextLine();)
        	{
        		String s = sc.nextLine();
	        	if(s.equals(""))
	        	{
	        		if((t++)==2)
	        			break;
	        		else
	    	    		continue;
	        	}
	        	if(m.containsKey(s))
	        		m.put(s,m.get(s)+1.0);
	        	else
	        		m.put(s,1.0);
	        	total++;
        	}
        	for (Map.Entry entry : m.entrySet()) 
		        System.out.printf("%s %.4f\r\n",entry.getKey(),((double)entry.getValue()/total)*100.0);
        }
    }
}
