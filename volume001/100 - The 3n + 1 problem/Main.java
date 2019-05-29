import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) 
		{	

			long a = scanner.nextLong();
			long b = scanner.nextLong();
			int max = -1000;
			
			for( long i = Math.min(a,b) ; i <= Math.max(a,b) ; i++ )
			{

				long n = i;
				int count = 1;
				
				while( true )
				{
					
					if(n == 1)
					{
						max = Math.max(max,count);
						break;
					}
					else
					{
						n = n % 2 == 1 ? 3 * n + 1 : n / 2 ;
						count++;
					}						

				}
			}	
			
			System.out.println(a+" "+b+" "+max);
			
			/*
			//�W�ɪ���
			LinkedList<Long> List = new LinkedList<Long>();
			long a = scanner.nextLong();
			long b = scanner.nextLong();
			int max = -1000;
			
			for(long n=Math.min(a,b) ; n<=Math.max(a,b) ; n++)
			{
				
				List.clear();
				List.add( n );
				
				while( List.get(List.size()-1) != 0 )
				{
					
					if(List.get(List.size()-1)==1)
					{
						max = Math.max(max,List.size());
						break;
					}
					else 
						List.add(List.get(List.size()-1) % 2 == 1 ? 3 * List.get(List.size()-1) + 1 : List.get(List.size()-1) / 2 );	
				
				}
			}	
			
			System.out.println(a+" "+b+" "+max);
			*/
		}
	}
}