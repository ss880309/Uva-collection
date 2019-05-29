import java.util.Scanner;
import java.math.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext())
		{
			int vt=scanner.nextInt();
			int v0=scanner.nextInt();
			if(vt==0 && v0==0)
			{
				break;
			}
			if(!(vt>v0))
			{
				System.out.println("0");
				continue;
			}
			
			int n=0;
			int max=0;
			for(int i=1; ((double)vt/i) > v0 ;i++)
			{
				int len = (-v0*i*i) + (vt*i) ;
				if(len>max)
				{
					max=len;
					n=i;
				}
				else if(len==max)
				{
					n=0;
				}
			}
			System.out.println(n);
		}
	}
}