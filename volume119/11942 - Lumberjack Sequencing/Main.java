import java.util.Arrays;
//import java.util.PriorityQueue;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int n = scanner.nextInt();
			int[][] a = new int[n][10];
			int[][] newa = new int[n][10];
			int[] mark = new int[n];
			Arrays.fill(mark,1);
			//PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
			for(int i=0;i<n;i++)
			{
				
				for(int j=0;j<10;j++)
				{
					a[i][j]=scanner.nextInt();
					newa[i][j]=a[i][j];
					//pq.add(a[i][j]);
				}
				
				Arrays.sort(newa[i]);
				//System.out.println(Arrays.toString(newa[i]));
				
				if(a[i][0] <= a[i][9])
				{
					for(int j=0;j<10;j++)
					{
						if(a[i][j]!=newa[i][j])
						{
							mark[i]=0;
							break;
						}
					}
				}
				else if(a[i][0] > a[i][9])
				{
				
					for(int j=0;j<10;j++)
					{
						if(a[i][j]!=newa[i][9-j])
						{
							mark[i]=0;
							break;
						}
					}
				}	
			}
		
			System.out.println("Lumberjacks:");
			
			for(int i=0;i<n;i++)
			{
				if(mark[i]==0)
				{
					System.out.println("Unordered");
				}
				else if(mark[i]==1)
				{
					System.out.println("Ordered");
				}
			}	
		}
	}
}





/*
import java.util.Scanner;
//11636 - Hello World!
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count=1;
		while(scanner.hasNext())
		{
			
			int a = scanner.nextInt();
			if(a==-1)	break;
			int result = (int) Math.ceil(Math.log(a)/Math.log(2)) ;
			//int result = (int) Math.ceil(Math.log(a)/Math.log(2));
			System.out.println("Case "+(count++)+": "+result);
			//System.out.println(String.format("Case %d: %d\n", count++,result));
			//String.format("Case %d: %d\n", count++,ans)
		}
	}
}
 */
