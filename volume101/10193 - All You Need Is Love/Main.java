import java.util.Scanner;
public class Main 
{
	public static int gcd (int m, int n) 
	{
        int tmp;
        while (m % n != 0) 
        {	
            tmp = n;
            n = m % n;
            m = tmp;
        }
        return n;  
	}

	
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			
			String sa = scanner.next();
			String sb = scanner.next();
			int a = Integer.parseInt(sa, 2);
			int b = Integer.parseInt(sb, 2);
			System.out.println("Pair #"+i+": "+ (gcd(a,b)!=1?"All you need is love!":"Love is not all you need!"));
			
		}
	}
}








