import java.util.Arrays;
import java.util.Scanner;
//11727 - Cost Cutting
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			
			int[] ary = new int[3];
			
			for(int j=0;j<ary.length;j++)
			{
				ary[j] = scanner.nextInt();
			}
			
			Arrays.sort(ary);
			
			System.out.println("Case "+i+": "+ary[1]);
			
		}
	}
}
