import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
   {
   		Scanner scanner = new Scanner(System.in);
   		System.out.println("PERFECTION OUTPUT");
		while(scanner.hasNext())
		{
			int n = scanner.nextInt();
			if(n==0)
			{
				System.out.println("END OF OUTPUT");
				break;
			}
			int sum = 0;
			for(int i=1;i<=n/2;i++)
			{
				if(n%i==0)
					sum+=i;
			}
			
			if(sum==n)
				System.out.printf("%5d  PERFECT\n",n);
			else if(sum>n)
				System.out.printf("%5d  ABUNDANT\n",n);
			else if(sum<n)
				System.out.printf("%5d  DEFICIENT\n",n);
			
		}
   }
}