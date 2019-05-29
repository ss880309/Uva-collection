import java.util.*;
import java.math.*;
public class Main
{
    //瘋狂程設測試資料有問題
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        while(N-->0)
        {
        	BigInteger n = new BigInteger(sc.nextLine());
        	String[] s = sc.nextLine().split(" ");
        	boolean is = true;
        	for(int i=0;i<s.length;i++)
        	{
        		if(!n.mod(new BigInteger(s[i])).equals(BigInteger.ZERO))
        		{
        			is = false;
        			break;
        		}
        	}
        	System.out.println(n+(is?" - Wonderful.":" - Simple."));	
        }  
    }
}
