import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		//final int left=-1;
		//final int right=1;
		
		int n=scanner.nextInt();
		for(int i=0;i<n;i++)//2
		{
			int result=0;
			int m=scanner.nextInt();//3
			int check[] = new int[m];//[0]=-1 [1]=1 
			for(int j=0;j<m;j++)//3
			{
				String s = scanner.next();
				if(s.equals("LEFT"))
				{
					check[j]=-1;
					result--;
					//System.out.println(result);
				}
					else if(s.equals("RIGHT"))
				{
					check[j]=1;
					result++;
					//System.out.println(result);
				}
				else// s = SAME s2=AS
				{
					String s2 = scanner.next();//AS
					int t = scanner.nextInt();//2
					result+=check[t-1];
				}
			}
			System.out.println(result);
		}
	}
}
