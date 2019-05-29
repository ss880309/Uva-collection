import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
public class Main 
{	
	public static String toString(int[] n)
	{
		String s = ""+n[0];
		for(int i=1;i<n.length;i++)
			s+=" "+n[i];
		return s;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Character,String> m = new HashMap<Character,String>();
		m.put(' ',"0000000000");
		m.put('c',"0111001111");
		m.put('d',"0111001110");
		m.put('e',"0111001100");
		m.put('f',"0111001000");
		m.put('g',"0111000000");
		m.put('a',"0110000000");
		m.put('b',"0100000000");
		m.put('C',"0010000000");
		m.put('D',"1111001110");
		m.put('E',"1111001100");
		m.put('F',"1111001000");
		m.put('G',"1111000000");
		m.put('A',"1110000000");
		m.put('B',"1100000000");
		while (sc.hasNext()) 
		{
			int N = sc.nextInt();	
			for(int c=0;c<N;c++)
			{
				String ot = m.get(' ');
				int[] n = new int[10];
				String s = sc.next();
				for(int i=0;i<s.length();i++)
				{
					String nt = m.get(s.charAt(i));
					for(int j=0;j<nt.length();j++)
					{
						if(ot.charAt(j)=='0'&&nt.charAt(j)=='1')
							n[j]++;
					}
					ot=nt;
				}
				System.out.println(toString(n));
			}		
/*
3
cdefgab
BAGFEDC
CbCaDCbCbCCbCbabCCbCbabae
*/	
		}
	}
}