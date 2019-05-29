import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);		
		StringBuilder sb = new StringBuilder("");
		String temp = scanner.nextLine();
		
		while(scanner.hasNext())
		{
			
			StringBuilder s = new StringBuilder(scanner.nextLine());
			//String s = scanner.nextLine();
			if(s.charAt(0)=='_')
				break;
			
			s.deleteCharAt(6);
			//| o   .  o| to | o     o| 128 ~ 1 
			
			int sum =0;
			for(int i=s.length()-2 ; i>=1 ; i--)
			{
				if(s.charAt(i)=='o')
					sum += Math.pow(2,8-i);							
			}
			
			sb.append((char)sum);
			
		}
		
		//雞婆多換行就會不通過......
		System.out.print(sb);

	}
}