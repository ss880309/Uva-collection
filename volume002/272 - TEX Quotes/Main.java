import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int count=0;
		while(scanner.hasNext())
		{
			
			String s = scanner.nextLine();
			StringBuilder sb = new StringBuilder("");

			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)=='"' && count%2==0)
				{
					sb.append("``");
					count++;
				}
				else if(s.charAt(i)=='"'&& count%2==1)
				{
					sb.append("''");
					count++;
				}
				else
				{
					sb.append(s.charAt(i));
				}
			}
			
			System.out.println(sb);
			
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
