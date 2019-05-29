import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		for(int i=0;i<a;i++)
		{
			
			int b=scanner.nextInt();
			int total=0;
			int[] score = new int[b];
			
			for(int j=0;j<score.length;j++)
			{
				score[j]=scanner.nextInt();
				total+=score[j];
			}
			
			double aver = (double)total / (double)score.length;
			int count=0;
			
			for(int j=0;j<score.length;j++)
			{
				if((double)score[j] > aver)
					count++;
			}
			
			double result = (count/(double)b)*100;
			System.out.printf("%2.3f%%%n",result);
			
		}
	}
}





/*
import java.util.Scanner;
//11636 - Hello World!
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count=1;
		while(scanner.hasNext())
		{
			
			int a = scanner.nextInt();
			if(a==-1)	break;
			int result = (int) Math.ceil(Math.log(a)/Math.log(2)) ;
			//int result = (int) Math.ceil(Math.log(a)/Math.log(2));
			System.out.println("Case "+(count++)+": "+result);
			//System.out.println(String.format("Case %d: %d\n", count++,result));
			//String.format("Case %d: %d\n", count++,ans)
		}
	}
}
 */
