import java.util.Arrays;
import java.util.Scanner;
//11689 - Soda Surpler
/*
 Three non-negative integers e,f,c,
 where e<1000 equals the number of empty soda bottles in Tim's possession at the start of the day, 
 	   f<1000 the number of empty soda bottles found during the day, 
 and 1<c<2000 the number of empty bottles required to buy a new soda.
 
 */
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			int e = scanner.nextInt();//一開始有多少空瓶子		5
			int f = scanner.nextInt();//蒐集到的空頻子		5
			int c = scanner.nextInt();//換取飲料需要的數目		2
			
			e += f;//10
			int sum = 0;
			int temp;
			
			while( e > c )
			{
				
				sum += e / c;
		        temp = e / c;
		        e = (e % c + temp);
				
			}
			
			if( e==c )
				sum++;
			
			System.out.println(sum);//9
			
		}
	}
}
