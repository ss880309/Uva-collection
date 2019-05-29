import java.util.HashMap;
import java.util.Scanner;
public class Main 
{
	public static boolean palindrome(String s)
	{
		return s.equals(new StringBuilder(s).reverse().toString());
	}
	
	public static boolean mirror(String s)
	{
		for(int i=0,j=s.length()-1;i<=s.length()/2;i++,j--)
		{
			switch(s.charAt(i))
			{
				case 'E':
			    if (s.charAt(j) != '3') 
			    	return false;
			    break;
			 
			   case '3':
			    if (s.charAt(j) != 'E') 
			    	return false;
			    break;
			 
			   case 'J':
			    if (s.charAt(j) != 'L') 
			    	return false;
			    break;
			 
			   case 'L':
			    if (s.charAt(j) != 'J') 
			    	
			    	return false;
			    break;
			 
			   case 'S':
			    if (s.charAt(j) != '2') 
			    	return false;
			    break;
			 
			   case '2':
			    if (s.charAt(j) != 'S') 
			    	return false;
			    break;
			 
			   case 'Z':
			    if (s.charAt(j) != '5') 
			    	return false;
			    break;
			 
			   case '5':
			    if (s.charAt(j) != 'Z') 
			    	return false;
			    break;	 
			   case 'A':
			   case 'H':
			   case 'I':
			   case 'M':
			   case 'O':
			   case 'T':
			   case 'U':
			   case 'V':
			   case 'W':
			   case 'X':
			   case 'Y':
			   case '8':
			    if (s.charAt(i) != s.charAt(j)) 
			    	return false;
			    break;
			   default:
				   return false;	
			}
		}
		return true;

		/*
		HashMap<Character,Character> map = new HashMap<Character,Character>();
		map.put('A','A');
		map.put('E','3');
		map.put('H','H');
		map.put('I','I');
		map.put('J','L');
		map.put('L','J');
		map.put('M','M');
		map.put('O','O');
		map.put('S','2');
		map.put('T','T');
		map.put('U','U');
		map.put('V','V');
		map.put('W','W');
		map.put('X','X');
		map.put('Y','Y');
		map.put('Z','5');
		map.put('1','1');
		map.put('2','S');
		map.put('3','E');
		map.put('5','Z');
		map.put('8','8');
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				if(!(map.containsKey(s.charAt(i))))
				{
					return false;
				}
			}
		}		
		return true;
		*/
	}
	
	public static void main(String[] args) 
	{
		
		Scanner scanner = new Scanner(System.in);
		
		while(scanner.hasNext())
		{
			String s = scanner.next();
			if(palindrome(s) && mirror(s))
				System.out.println(s+" -- is a mirrored palindrome.\n");
			else if(!palindrome(s) && mirror(s))
				System.out.println(s+" -- is a mirrored string.\n");
			else if(palindrome(s) && !mirror(s))
				System.out.println(s+" -- is a regular palindrome.\n");
			else if(!palindrome(s) && !mirror(s))
				System.out.println(s+" -- is not a palindrome.\n");
		}
		
	}
}









