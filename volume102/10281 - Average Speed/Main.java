import java.util.*;
public class Main
{
    static double toSec(String S)
    {
    	String[] s = S.split(":");
    	double[] a = new double[s.length];
    	for(int i=0;i<s.length;i++)
    		a[i] = Double.parseDouble(s[i]);
    	return a[2]+a[1]*60.0+a[0]*3600.0;
    }
    public static void main(String[] args) 
    {
       	Scanner sc = new Scanner(System.in);
       	String time = "00:00:00";
       	double per = 0.0d;
       	double sum = 0.0d;
       	while(sc.hasNext())
       	{
       		
       		String in = sc.nextLine().trim();
       		String[] s = in.split(" ");
       		if(in.length()>8)
       		{
       			double n = toSec(s[0])-toSec(time);
       			sum += n*(per/3600);
       			
       			
       			time = s[0];
       			per = Double.parseDouble(s[1]);
       		}
       		else
       		{
       			double n = toSec(s[0])-toSec(time);
       			sum += n*(per/3600);
       			
       			System.out.printf("%s %.2f km%n",s[0],sum);
       			time = s[0];
       		}
       		
       		
       		
       		
       	}
       	
       	
       	
       	
    }
};
