/**
 * @(#)Main.java
 *
 *
 * @author 
 * @version 1.00 2013/12/6
 */
//import java.math.*;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
        	//BigInteger a = scanner.nextBigInteger();
  		 	//BigInteger b = scanner.nextBigInteger();
   	        long a= scanner.nextLong();
   	        long b= scanner.nextLong();
   	        if(a>b)
            {
        		System.out.println(a-b);
            }
            else if(a<b)
            {
        		System.out.println(b-a);
            }
            else if(a==b)
            {
             	System.out.println("0");
            }
        }  
    }
}
 /*
import java.math.*;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        {
        	BigInteger a = scanner.nextBigInteger();
  		 	BigInteger b = scanner.nextBigInteger();
   	        if(a.intValue()>b.intValue())
            {
        		System.out.println(a.subtract(b));
            }
            else if(a.intValue()<b.intValue())
            {
        		System.out.println(b.subtract(a));
            }
            else if(a.equals(0))
            {
             	System.out.println("0");
            }
        }  
    }
}
*/
