import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int c = 1;
        while(sc.hasNext())
        {
        	int N = sc.nextInt();//5
        	if(N==0)
        		break;
        	int[][] n = new int[N][N];
        	for(int i=0;i<N;i++)
        		for(int j=0;j<N;j++)
        			n[i][j] = sc.nextInt();
        	StringBuilder sb = new StringBuilder("Case "+(c++)+":");
        	int count = N/2+N%2;
        	
        	for(int i=0;i<count;i++)
        	{
        		int sum = 0;
        		
        		//top
        		for(int j=i;j<N-i;j++)	
	        		sum+=n[i][j];
	        	//left
	        	for(int j=i+1;j<N-i;j++)
	        		sum+=n[j][i];
	        	//down
	        	for(int j=i+1;j<N-i;j++)	
	        		sum+=n[N-1-i][j];
	        	//right
	        	for(int j=i+1;j<N-i-1;j++)
	        		sum+=n[j][N-1-i];
	        		
	        	sb.append(" "+sum);	
        	}   	
        	System.out.println(sb);
        }  
    }
}
