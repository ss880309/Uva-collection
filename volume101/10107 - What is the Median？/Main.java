import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> List = new ArrayList<Integer>();
		
		while (scanner.hasNext()) 
		{	
			
			int n = scanner.nextInt();	 
			List.add(n);
			Collections.sort(List);
			int mid = List.size()%2==1 ? List.get(List.size()/2) : (List.get(List.size()/2-1) + List.get(List.size()/2))/2;
			
			System.out.println(mid);
		
		}
	}
}