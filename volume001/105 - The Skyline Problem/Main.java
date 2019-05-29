import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
{
	static int[] n = new int[10000];
	static int from = 9999999;
	static int to = -1; 
	
	public static void set(int l,int h,int r)
	{
		
		for(int i=l;i<r;i++)
			n[i] = Math.max(n[i], h);
		from = Math.min(from, l);
		to = Math.max(to, r);
	}
	 
	public static void main(String[] args) 
	{
		// ( L H R )
		Scanner sc = new Scanner(System.in);
		
		//for(int z=0;z<8;z++)
		while(sc.hasNext())
			set(sc.nextInt(),sc.nextInt(),sc.nextInt());
			
		StringBuilder sb = new StringBuilder(from+" "+n[from]);
		
		for(int i=from+1;i<=to;i++)
		{
			if(n[i]!=n[i-1])
				sb.append(" "+i+" "+n[i]);
		}
		
		System.out.println(sb);
		
	}
}









