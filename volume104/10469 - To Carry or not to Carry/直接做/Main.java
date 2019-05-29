import java.util.*;
public class Main
{
    public static int result(String a,String b)
    {
    	
    	int count = 0;
    	int temp = 1;
    	for(int i=0;i<Math.max(a.length(),b.length());i++)
    	{
			try{
		    	if(a.charAt(i)!=b.charAt(i))
		    		count += temp;
	    	}catch(Exception ex)
	    	{
	    		try
	    		{
		    		if(a.charAt(i)=='1')
		    			count += temp;
	    		}catch(Exception innerex)
	    		{
	    			if(b.charAt(i)=='1')
		    			count += temp;
	    		}
	    		
	    	}
	    		
    		temp*=2;
    		
    	}
    	return count;
    }
    
    
    
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
        	String a = new StringBuilder(Integer.toBinaryString(sc.nextInt())).reverse().toString();
        	String b = new StringBuilder(Integer.toBinaryString(sc.nextInt())).reverse().toString();
        	//System.out.println(a);
        	//System.out.println(b);
        	System.out.println(result(a,b));
        	
        	
        }
        
        
        
    }
};
