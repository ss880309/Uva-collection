import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		for(int i=0;i<n+1;i++)
		{
			if(i==0) //javaªº \n °ÝÃD
			{
				String qq = scanner.next();
				continue;
			}
				
			
			String s = scanner.nextLine();
			//System.out.println(n+" "+s);
			int even= 0;// 0 2 4 ...
			int odd = 0;// 1 3 5 ...
			
			int sum=0;
			int j=0;
			while(j<s.length())
			{
				if(s.charAt(j)==' ')
				{
					j++;
					continue;
				}
				
				//int even= 0;// 0 2 4 ...
				//int odd = 0;// 1 3 5 ...
				even=(s.charAt(j)-'0')*2;
				sum += (even/10 + even%10);
				
				odd = s.charAt(j+1)-'0';
				sum += odd;
				//System.out.println(even);
				j+=2;
				
			}
			
			if(sum%10==0)
				System.out.println("Valid");
			else if(sum%10!=0)
				System.out.println("Invalid");

		}
	}
}