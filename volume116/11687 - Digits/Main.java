import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			
			String[] a = new String[100];
			a[0]=scanner.next();;
			if(a[0].equals("END"))
				break;
				
			int i=1;
			while(true)
			{
				a[i] = (a[i-1].length() + "");
				if(a[i].equals(a[i-1]))
					break;
				i++;
			}
				
			System.out.println(i);
			
		}
	}
}