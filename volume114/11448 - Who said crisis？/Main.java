import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;
public class Main 
{

	public static void main(String[] args) throws IOException	
	{
		Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int n = scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			BigInteger a = scanner.nextBigInteger();
			BigInteger b = scanner.nextBigInteger();
			System.out.println(a.subtract(b));
			
			
		}
	}
}