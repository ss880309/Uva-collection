import java.math.BigInteger;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//new BigInteger("") ~=  BigInteger.valueOf()   用哪個都可以 
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			BigInteger a = scanner.nextBigInteger();
			if(a.equals(new BigInteger("0")))
				break;
			 a = a.divide(new BigInteger("10")).subtract(a.mod(new BigInteger("10")).multiply(new BigInteger("5")));
			 if(a.mod(new BigInteger("17")).equals(new BigInteger("0")))
				 System.out.println("1");
			 else
				 System.out.println("0");
			
		}
	}
}