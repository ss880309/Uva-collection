import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			
			String s = scanner.nextLine();
			int count = 0;
			for(int i=0;i<s.length()-1;i++)
			{
				if(Character.isLetter(s.charAt(i)) && !Character.isLetter(s.charAt(i+1)))
					count++;	
			}
			
			System.out.println(count);
			
		}
	}
}