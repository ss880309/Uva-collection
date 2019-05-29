import java.util.*;
public class Main
{

	public static boolean is(int[][] n)
	{
		for(int i=0;i<n.length;i++)
		{
			int I = n.length-i-1;
			for(int j=0;j<n.length;j++)
			{
				int J = n.length-j-1;
				if(n[i][j]!=n[I][J])
					return false;
			}
		}
		return true;
	}
	
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("�п�J�x�}�Ӽ�:");
        while(sc.hasNext())
        {
        	int count = sc.nextInt();
	        for(int c = 1;c <= count; c++)
	        {
	        	System.out.println("�п�J��"+c+"th �x�}����:");
	        	int N = sc.nextInt();
	        	int[][] n = new int[N][N];
	        	System.out.println("�п�J�x�}:");
	        	for(int i=0;i<N;i++)
	        		for(int j=0;j<N;j++)
		        		n[i][j] = sc.nextInt();		
	        	System.out.println(is(n)?"Symmetric":"Non-symmetric");
	        }
        }
    }
};
/*
1 3
1 2 3
2 5 2
3 2 1
*/