import java.util.Scanner;
public class Main 
{
	//ans = p*(1-p)^(i-1)/(1-(1-p)^n) 
	public static void main(String[] args) 
	{
		Scanner scanner  = new Scanner(System.in);
		int s = scanner.nextInt();
		for(int j=0;j<s;j++)
		{
			double n = scanner.nextDouble();
			double p = scanner.nextDouble();
			double i = scanner.nextDouble();
			double ans = p*(Math.pow(1.0-p, i-1.0))/(1-Math.pow(1.0-p, n));
			if(p==0.0) //because NaN
				System.out.println("0.0000");
			else
				System.out.printf("%.4f\n",ans);
			
		}
	}
}
