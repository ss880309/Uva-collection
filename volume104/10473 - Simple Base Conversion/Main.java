import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		while(scanner.hasNext())
		{
			
			String s = scanner.next();

			if(s.charAt(0)=='0')// Hex to de
			{
				s = s.substring(2);
				System.out.println(Long.valueOf(s,16));			
			}
			else				//de to Hex
			{
				if(Long.parseLong(s) < 0)
					break;
				
				System.out.println("0x"+Long.toHexString(Long.parseLong(s)).toUpperCase());	
			}
			
		}
	}
}