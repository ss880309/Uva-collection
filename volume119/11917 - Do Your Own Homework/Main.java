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
			//classday 				->�@�����ɶ�
			int day=scanner.nextInt();//����
			String s=scanner.next();
			
			for(int j=0;j<n;j++)
			{
				if(s.equals(Class[j]))
				{
					if(day>=Classday[j])//�����ո�ƽs���~�п�X"Yesss"��ܧ����ɶ����W�LD��
					{
						System.out.println("Case "+i+": Yesss");
						break;
					}
					else if(!(day>=Classday[j]) && day+5>=Classday[j])//��X"Late"��ܧ����ɶ��W�LD������W�LD+5��
					{
						System.out.println("Case "+i+": Late");
						break;
					}
					else //�Y�����ɶ��W�LD+5��Φo���Q���������@�~�A�п�X"Do your own homework!"
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
