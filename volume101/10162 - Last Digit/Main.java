import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int[][] num = 
        {
        {0},{1},{6,2,4,8},{1,3,9,7},{6,4},{5},{6},{1,7,9,3},{6,8,4,2},{1,9}
        };
        
        while(scanner.hasNext())
        {
        	long sum = 0;
        	int n = scanner.nextInt();
        	if(n==0)
        		break;
        		
        	for(int i=1;i<=n;i++)
        		sum += num[i%10][i%(num[i%10].length)];	
        			
        	System.out.println(sum%10);
        }
    }
}
