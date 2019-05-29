import java.util.Arrays;
import java.util.Scanner;
public class Main
{
   public static void main(String[] args) 
   {
   		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int n1 = scanner.nextInt();
			//ArrayList<Integer> price = new ArrayList<Integer>();
			for(int i=1;i<=n1;i++)
			{
				int n2 = scanner.nextInt();
				int[] price = new int[n2];
				for(int j=0;j<n2;j++)
					price[j] = scanner.nextInt();
				Arrays.sort(price);
				if(n2>=3)
				{
					int sum = 0;
					for(int j=n2-1-2;j>=0;j-=3)
						sum += price[j];
					System.out.println(sum);
				}
				else
					System.out.println("0");
			}
		}
   }
}