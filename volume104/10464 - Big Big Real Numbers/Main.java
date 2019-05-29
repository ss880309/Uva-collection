import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		DecimalFormat out = new DecimalFormat();
		out.setGroupingUsed(false);//百位的分號
		out.setMinimumFractionDigits(1);
		out.setMaximumFractionDigits(1000);
		
		int n = scanner.nextInt();
		for(int i=0;i<n;i++)
		{

			BigDecimal a = scanner.nextBigDecimal();
		    BigDecimal b = scanner.nextBigDecimal();
		    
		    String s = out.format( a.add(b) );
		    System.out.println(s);
			
		}
	}
}
