import java.util.Scanner;
import static java.lang.Math.abs;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		double a,b;
		while(scanner.hasNext())
		{
			
			String s = scanner.next();
			
			if(s.equals("0:00"))
				break;
			else if(s.length()==4)//x:xx
			{
				a =  s.charAt(0)-'0';
				b = (s.charAt(2)-'0')*10 + s.charAt(3)-'0';
			}
			else//xx:xx
			{
				a = (s.charAt(0)-'0')*10 + s.charAt(1)-'0';
				b = (s.charAt(3)-'0')*10 + s.charAt(4)-'0';
			}
			
			a = a * 30.0 + (b / 60.0) * 30.0;
			b = b * 6.0;
			
			double ans = abs(a-b) > 180 ? 360.0 - abs(a-b) : abs(a-b);
			
			System.out.printf("%.3f\n",ans);
			
		}
	}
}