import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        HashMap m = new HashMap<Integer,String>();
        for(int i=0;i*i<50000;i++)
        {
        	for(int j=i;j*j<50000;j++)
	        {
	        	for(int k=j;k*k<50000;k++)
		        {
		        	int t = i*i+j*j+k*k;
		        	if(!m.containsKey(t))
		        		m.put(t,i+" "+j+" "+k);
		        }
	        }
        }

        int N = sc.nextInt();
        while(N-->0)
        {
        	int n = sc.nextInt();
        	System.out.println(m.containsKey(n)?m.get(n):"-1");
        } 
        
    }
}
