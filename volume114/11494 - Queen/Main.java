import java.util.Scanner;
import static java.lang.Math.*;
public class Main 
{
	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			
			int x1 = scanner.nextInt();
			int y1 = scanner.nextInt();
			int x2 = scanner.nextInt();
			int y2 = scanner.nextInt();
			
			if( x1==0 && y1==0 && x2==0 && y2==0 )
				break;
			else if( x1==x2 && y1==y2 )//原點
				System.out.println("0");
			else if(x1==x2 || y1==y2)//十字
				System.out.println("1");
			else if(abs(x2-x1) == abs(y2-y1))//對角
				System.out.println("1");
			else
				System.out.println("2");
			
		}
	}
}