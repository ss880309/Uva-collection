import java.math.BigInteger;
import java.util.Scanner;
public class Main 
{
	
	public static void main(String[] args)	
	{
		Scanner scanner = new Scanner(System.in);		
		BigInteger result = BigInteger.ZERO;
		while(scanner.hasNext())
		{
			BigInteger temp = scanner.nextBigInteger();
			if(temp.equals(BigInteger.valueOf(0)))
			{
				System.out.println(result);
				break;
			}
			
			result = result.add(temp);
			
		}
	}
}