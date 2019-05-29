import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		String[] num = {"", "1", "22", "333", "4444", "55555", "666666", "7777777", "88888888", "999999999"};
		
		while (scanner.hasNext()) 
		{		 
			int n = scanner.nextInt();
			for(int z=0;z<n;z++)
			{
				int a = scanner.nextInt();
				int f = scanner.nextInt();
				StringBuilder sb = new StringBuilder("");
				 
				for(int i = 1; i <= f; i++) 
				{
				     for (int j = 1; j <= a; j++) 
				     {
				    	 sb.append(num[j]+"\n");
				     }
				     
				     for (int j = a - 1; j > 0; j--) 
				     {
				    	 sb.append(num[j]+"\n");
				     }
				      
				     if(i < f)
				     {
				      sb.append("\n");
				     }
				     
				}
				     
				System.out.print(sb);
				
				if(z != n-1)
				    System.out.println();
				//n--;     
			}
			
			/*
			//¶W®É
			System.out.println();
			int a = scanner.nextInt();//3
			int f = scanner.nextInt();//2
			
			for(int l=0;l<f;l++)
			{
				
				for(int j=1;j<=a;j++)
				{
					for(int k=1;k<=j;k++)
					{
						System.out.print(j);
					}
					System.out.println();
					
				}
				
				for(int j=a-1;j>=1;j--)
				{
					for(int k=1;k<=j;k++)
					{
						System.out.print(j);
					}
					System.out.println();
					
				}
				
				System.out.println();
				
			}
			*/
		}
	}
}