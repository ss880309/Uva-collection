import java.util.Arrays;
import java.util.Scanner;
public class Main 
{		
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.console();
		while(sc.hasNext())
		{
			//s a 
			double s = sc.nextDouble();
			double a = sc.nextDouble();
			String u = sc.next();//  deg = min * 60
			
			if (u.equals("min"))
				a /= 60;
			
			if (a > 180.0)
				a = 360.0 - a;
			
			double r = s + 6440.0;//地球到行星距離 = 地球表面到行星距離 + 地球半徑
			double l = 2.0 * r * Math.sin((a * Math.PI / 180.0) / 2.0); //弧的長度
			double x = 2.0 * Math.PI * r * a / 360.0;					//弦的長度
			
			System.out.printf("%.6f %.6f%n", x, l);
			
			
		}
		
		
		
		
		/*
		//dna sorting
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();//1
		for(int i=0;i<N;i++)
		{
			int a = sc.nextInt();//10
			int b = sc.nextInt();//6
			//6 line
			String[] s = new String[b];
			int[] k = new int[b];
			for(int j=0;j<b;j++)
				s[j] = sc.next();
			
			for(int j=0;j<s.length;j++)
			{
				char[] t = s[j].toCharArray();
				int count = 0;
				for(int m=0;m<t.length-1;m++)
				{
					for(int n=m+1;n<t.length;n++)
					{
						if(t[m]>t[n])
						{
							char temp = t[m];
							t[m] = t[n];
							t[n] = temp;
							count++;
						}
					}
				}
				k[j] = count;
				
			}

			for(int j=0;j<b-1;j++)
			{
				for(int m=j+1;m<b;m++)
				{
					if(k[j]>k[m])
					{
						int temp = k[j];
						k[j] = k[m];
						k[m] = temp;
						
						String ts = s[j];
						s[j] = s[m];
						s[m] = ts;
						
					}				
				}
				
			}
			
			for(int j=1;j<s.length;j++)
			{
				if(k[j-1]==k[j])
				{
					if(s[j-1].charAt(0)>s[j].charAt(0))
					{
						String ts = s[j];
						s[j] = s[j-1];
						s[j-1] = ts;
					}	
				}
			}
			
			
			
			for(int j=0;j<b;j++)
				System.out.println(s[j]);
			
			System.out.println(Arrays.toString(k));
			
			
		}
		*/
	}
}

/*
1
10 6
AACATGAAGG
TTTTGGCCAA
TTTGGCCAAA
GATCAGATTT
CCCGGGGGGA
ATCGATGCAT
 */






