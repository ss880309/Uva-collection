
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
        	StringBuilder s = new StringBuilder("");
        	int a = scanner.nextInt();
        	int count=0;
        	s.append(a);
        	s.reverse();
        	if(Integer.parseInt(s.toString())==a)
        	{
        		System.out.println(count+" "+a);
        	}
        	else
        	{
        		while(!(Integer.parseInt(s.toString())==a))
        		{
         			a=Integer.parseInt(s.toString())+a;
        			s.delete(0,s.length());
        			s.append(a);
        			s.reverse();
        			count++;
        		}
        		System.out.println(count+" "+a);
        	}
        	
        } 
    }
}

/*
import java.util.Scanner;
import java.math.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++)
        {
        	StringBuilder s = new StringBuilder("");
        	//long a = scanner.nextLong();
        	BigInteger a = scanner.nextBigInteger();
        	//String a = scanner.next();
        	int count=0;
        	s.append(a).reverse();
        	if(a.equals(s.toString()))
        	{
        		System.out.println(count+" "+a);
        	}
        	else
        	{
        		while(!(a.equals(s.toString())))
        		{
         			//a=Integer.toString((Integer.parseInt(s.toString())+Integer.parseInt(a)));
         			BigInteger b = new BigInteger(s.toString());
         			a=a.add(b);
        			s.delete(0,s.length());
        			s.append(a).reverse();
        			count++;
        		}
        		System.out.println(count+" "+a);
        	}
        	
        } 
    }
}
*/