import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int m=scanner.nextInt();
		for(int i=1;i<=m;i++)
		{
			
			int n=scanner.nextInt();
			String[] Class = new String[n];
			int[] Classday = new int[n];
			for(int j=0;j<n;j++)
			{
				Class[j]=scanner.next();
				Classday[j]=scanner.nextInt();
			}
			//classday 				->　完成時間
			int day=scanner.nextInt();//期限
			String s=scanner.next();
			
			for(int j=0;j<n;j++)
			{
				if(s.equals(Class[j]))
				{
					if(day>=Classday[j])//除測試資料編號外請輸出"Yesss"表示完成時間不超過D日
					{
						System.out.println("Case "+i+": Yesss");
						break;
					}
					else if(!(day>=Classday[j]) && day+5>=Classday[j])//輸出"Late"表示完成時間超過D日但不超過D+5日
					{
						System.out.println("Case "+i+": Late");
						break;
					}
					else //若完成時間超過D+5日或她不想幫忙做此作業，請輸出"Do your own homework!"
					{
						System.out.println("Case "+i+": Do your own homework!");
						break;
					}
				}	
				if(!s.equals(Class[j]) && j==n-1)
				{
					System.out.println("Case "+i+": Do your own homework!");
				}
			}
		}
	}
}
