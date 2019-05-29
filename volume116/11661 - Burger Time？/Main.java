import java.util.Scanner;
import static java.lang.Math.*;
public class Main 
{
	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			
			int a = scanner.nextInt();
			if(a==0)
				break;
			String s = scanner.next();
			
			int r = -1;
			int d = -1;
			int z = 0;
			int min = Integer.MAX_VALUE;
			
			for(int i=0;i<s.length();i++)
			{
				
				if(s.charAt(i)=='R')
					r=i;		
				else if(s.charAt(i)=='D')
					d=i;
				else if(s.charAt(i)=='Z')
				{
					z=1;	
					break;
				}
				
				if( d > -1 && r > -1 )
					min = ( abs(d-r) < min ) ? abs(d-r) : min ;
					
			}
			
			if(z==1)
				System.out.println("0");
			else
				System.out.println(min);
			
		}
	}
}