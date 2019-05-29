import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Main 
{

	public static void main(String[] args) throws IOException	
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println((char)((scanner.next().charAt(0)-'0')%10));
		//int n1 = scanner.nextInt();
		int n1 = Integer.parseInt(br.readLine());
		for(int i=0;i<n1;i++)
		{
			String line = br.readLine();
			int n2 = Integer.parseInt(br.readLine());
			//int n2 = scanner.nextInt();
			//int[] a = new int[n2];
			//int[] b = new int[n2];
			int[] n = new int[n2+1];
			n[0] = 0;
			StringBuilder sb = new StringBuilder("");
			for(int j=1;j<=n2;j++)
			{
				//n[j] = scanner.nextInt() + scanner.nextInt();
				String s = br.readLine();
				String[] temp = s.split(" ");
				n[j] = Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]);
				//a[j] = scanner.nextInt();
				//b[j] = scanner.nextInt();	
				//sb.append(scanner.nextInt() + scanner.nextInt());
				if(n[j]>9)
				{
					//System.out.println(n[j-1]);
					n[j-1]+=1;
					//System.out.println(n[j-1]);
					n[j]=n[j]%10;
					
				}
				
				//if(j==1 && n[0]!=0)
				//	sb.append(n[0]);
				//sb.append(n[j]);
			}
			
			for(int j=0;j<n.length;j++)
			{
				sb.append(n[j]);
			}
			
			if(sb.length()<n2)
			{
				sb.reverse();
				for(int j=0;j<n2-sb.length();j++)
				{
					sb.append(0);
				}
				sb.reverse();
			}
			
			else if(sb.length()>n2)
			{
				//sb.reverse();
				for(int j=0;j<sb.length()-n2;j++)
				{
					sb.deleteCharAt(j);
				}
				//sb.reverse();
			}
			
			System.out.println(sb);
			
			
			if(i!=(n1-1))
				System.out.println();
			
			/*
			for(int j=0;j<n2;j++)
			{
				a[j] = scanner.nextInt();
				b[j] = scanner.nextInt();	
			}
			BigInteger n = BigInteger.valueOf(a[0]).add(BigInteger.valueOf(b[0]));
			
			for(int j=1;j<n2;j++)
			{
				n = n.multiply(BigInteger.valueOf(10));
				n = n.add(BigInteger.valueOf(a[j]).add(BigInteger.valueOf(b[j])));
			}
			
			System.out.println(n);
			
			if(i!=(n1-1))
				System.out.println();
			*/
			
		}
	}
}