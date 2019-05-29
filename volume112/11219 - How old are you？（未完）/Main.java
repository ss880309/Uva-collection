import java.util.Arrays;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<n+1;i++)
		{
			StringBuilder s = new StringBuilder(scanner.next());
			StringBuilder day1   = new StringBuilder("");
			StringBuilder month1 = new StringBuilder("");
			StringBuilder year1  = new StringBuilder("");
			
			int d1 = Integer.parseInt(day1.append(s.charAt(0)).append(s.charAt(1)).toString());
			int m1 = Integer.parseInt(month1.append(s.charAt(3)).append(s.charAt(4)).toString());
			int y1 = Integer.parseInt(year1.append(s.charAt(6)).append(s.charAt(7)).append(s.charAt(8)).append(s.charAt(9)).toString());
			
			s = new StringBuilder(scanner.next());
			StringBuilder day2   = new StringBuilder("");
			StringBuilder month2 = new StringBuilder("");
			StringBuilder year2  = new StringBuilder("");
			
			int d2 = Integer.parseInt(day2.append(s.charAt(0)).append(s.charAt(1)).toString());
			int m2 = Integer.parseInt(month2.append(s.charAt(3)).append(s.charAt(4)).toString());
			int y2 = Integer.parseInt(year2.append(s.charAt(6)).append(s.charAt(7)).append(s.charAt(8)).append(s.charAt(9)).toString());
			
			if(y1>y2)
			{
				if(m1>m2)
				{
					
					System.out.println("Case #"+i+": "+(y1-y2));					
					
				}
				else if(m1<m2)
				{
					
					System.out.println("Case #"+i+": "+(y1-y2-1));
					
				}
				else if(m1==m2)
				{
					if(d1>d2)
					{
						
						System.out.println("Case #"+i+": "+(y1-y2-1));					
						
					}
					else if(d1<=d2)
					{
						
						System.out.println("Case #"+i+": "+(y1-y2));
						
					}
				}
			}
			else if(y1<y2)
			{
				
			}
			
			
			//System.out.println(year);
			/*
			if(Integer.parseInt(year1.toString())==Integer.parseInt(year2.toString()))
			{
				if(Integer.parseInt(month1.toString())==Integer.parseInt(month2.toString()))
				{
					if(Integer.parseInt(day1.toString())==Integer.parseInt(day2.toString()))
					{
						System.out.println("Case #"+i+": Invalid birth date");
					}
					else if(Integer.parseInt(day1.toString())>Integer.parseInt(day2.toString()))
					{
						System.out.println("Case #"+i+": 0");
					}
					else
					{
						System.out.println("Case #"+i+": Invalid birth date");
					}
				}
				else if(Integer.parseInt(month1.toString())>Integer.parseInt(month2.toString()))
				{
					System.out.println("Case #"+i+": 0");
				}
				else
				{
					System.out.println("Case #"+i+": Invalid birth date");
				}
			}
			else if(Integer.parseInt(year1.toString())>Integer.parseInt(year2.toString()))
			{
				if((Integer.parseInt(year1.toString())-Integer.parseInt(year2.toString())>130))
				{
					System.out.println("Case #"+i+": Check birth date");
					continue;
				}
				if(Integer.parseInt(month1.toString())>Integer.parseInt(month2.toString()) && Integer.parseInt(day1.toString())>Integer.parseInt(day2.toString()))
					System.out.println("Case #"+i+": "+(Integer.parseInt(year1.toString())-Integer.parseInt(year2.toString())));
				else
					System.out.println("Case #"+i+": 0");
			}
			else
			{
				System.out.println("Case #"+i+": Invalid birth date");
			}
			*/
		}
	}
}