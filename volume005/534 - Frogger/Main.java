import java.util.Arrays;
import java.util.Scanner; 

class Node 
{
    int x;
    int y;
 
    public Node(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
    
    public String toString() 
    {
        return "[x=" + x + ", y=" + y + "]";
    }
 
    public double getDistance(Node b) 
    {
        return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2));
    }
 
}
 
public class Main 
{
 
    public static void main(String[] args)
    {
 		Scanner sc = new Scanner(System.in);    
 		int count = 1;  
        while(sc.hasNext()) 
        {
            int N = sc.nextInt();
            
            if (N == 0) 
                break;
                
            Node[] n = new Node[N];
            
            for (int i = 0; i < N; i++) 
 				n[i] = new Node(sc.nextInt(),sc.nextInt());
            
  
            double[][] w = new double[N][N]; // weighted matrix
            double[][] d = new double[N][N]; // to be All-Pair Shortest path
 
            for (double[] ds : w) 
                Arrays.fill(ds, Double.POSITIVE_INFINITY); 
			
			//show fill with infinity
			//for(int i=0;i<N;i++)
			//	System.out.println(Arrays.toString(w[i]));
					
            for (int i = 0; i < N; i++) 
                w[i][i] = 0; // go to itself with cost0
             
            //cal weight
            for (int i = 0; i < N; i++) 
            {
                for (int j = 0; j < N; j++) 
                    w[i][j] = n[i].getDistance(n[j]);
            }
            
            //show distance
            //for(int i=0;i<N;i++)
			//	System.out.println(Arrays.toString(w[i]));
            
            //copy
            for (int i = 0; i < N; i++) 
            {
                for (int j = 0; j < N; j++)
                    d[i][j] = w[i][j];
            }
            
            
            //do the minimax Floyd
            for (int k = 0; k < N; k++) 
            {
                for (int i = 0; i < N; i++) 
                {
                    for (int j = 0; j < N; j++) 
                        d[i][j] = Math.min(d[i][j], Math.max(d[i][k], d[k][j]));  
                }
            }
            
            
            System.out.println("Scenario #" +(count++));
            System.out.printf("Frog Distance = %.3f\r\n\r\n", d[0][1]);
 
        }
 
    }
 
}