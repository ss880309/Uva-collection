import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        TreeMap m = new TreeMap<Long,String>();
        long[] t = new long[60];
        
        //這題的測試資料有問題     瘋狂程設過不了#
        
        for(int i=1;i<t.length;i++)
        {
        	//long test = i*i*i;
        	//if(test<=10000)
        	//	t[i] = test; 
        	t[i] = i*i*i;	
        }
        for(int i=1;i<t.length;i++)
        {
        	for(int j=1;j<i;j++)
        	{
        		long temp = t[i]-t[j];
        		if(!m.containsKey(temp))
        			m.put(temp,i+" "+j);
        	}
        }
        
        //System.out.println(m);
        
        while(sc.hasNext())
        {
        	long n = sc.nextLong();
        	if(n==0)
        		break;
        	System.out.println(m.containsKey(n)?m.get(n):"No solution");
        	
        }
    }
}

