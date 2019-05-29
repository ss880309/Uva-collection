
import java.util.Scanner;

public class Main
{
	//uva 11069
	static int[] num = new int[76+1];
	static boolean first = true;
	public static int dp(int n)
	{
		if(first)
		{
			num[0]=0;
			num[1]=1;
			num[2]=2;
			num[3]=2;
			first = false;
		}
		if(num[n]!=0)
			return num[n];
		for(int i=4;i<=n;i++)
		{
			if(num[i]==0)
				num[i] = num[i-2] + num[i-3];
		}
		return num[n];
	}

    public static void main(String[] args)
    {
    	Scanner scanner = new Scanner(System.in);
    	while(scanner.hasNext())
    	{
    		int n = scanner.nextInt();//1~76
			System.out.println(dp(n));
    	}
    }
}