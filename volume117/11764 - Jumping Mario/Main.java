import java.util.Scanner;
//11764 - Jumping Mario
public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			
			int a = scanner.nextInt();
			int[] wall = new int[a];
			for(int j=0;j<wall.length;j++)
			{
				wall[j]=scanner.nextInt();
			}
			
			
			int hi=0;
			int lw=0;
			
			for(int j=0;j<wall.length-1;j++)
			{
				if(wall[j]<wall[j+1])
					hi++;
				else if(wall[j]>wall[j+1])
					lw++;	
			}	
			
			System.out.println("Case "+i+": "+hi+" "+lw);
			
		}
	}

}
