import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main 
{
	public static void main(String[] args)	
	{
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext())
		{
			int n = scanner.nextInt();
			TreeMap<String,Integer> map = new TreeMap<String,Integer>();
			
			for(int i=0;i<n;i++)
			{
		
				String s = scanner.next();
				String name = scanner.nextLine();
				
				if( map.containsKey( s ) )
					map.put( s , map.get( s ) + 1 );
				else
					map.put( s , 1 );
				
			}
			
			for(Map.Entry<String, Integer> i: map.entrySet())   
			    System.out.println(i.getKey() + " " + i.getValue());
			
		}
	}
}
