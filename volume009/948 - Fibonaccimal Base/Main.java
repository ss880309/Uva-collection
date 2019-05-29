import java.util.Scanner;
public class Main
{
   public static void main(String[] args)
   {
   		long[] a = new long[40];
	    a[0]=0;
	    a[1]=1;
   		for(int i=2;i<a.length;i++)
		   a[i] = a[i-1]+a[i-2];
   		//System.out.println(Arrays.toString(a));
	    Scanner scanner = new Scanner(System.in);
   		int num = scanner.nextInt();
		for(int i=0;i<num;i++)
		{
			long n = scanner.nextLong();
			StringBuilder sb = new StringBuilder(n+" = ");
			boolean begin = false;
			for(int j=a.length-1;j>=2;j--)
			{
				if(n>=a[j])
				{
					sb.append(1);
					n-=a[j];
					begin = true;
				}
				else if(begin)
				{
					sb.append(0);
				}
			}
			System.out.println(sb.append(" (fib)"));
		}
   }
}