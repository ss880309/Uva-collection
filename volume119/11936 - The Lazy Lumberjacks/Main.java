import java.util.Arrays;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//�H���O�M�Ѥu�@������  �A�{�b�s�ڤ���T����?
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			
			int[] a = new int[3];
			
			for(int j=0;j<a.length;j++)
				a[j]=scanner.nextInt();
			
			if(a[0]+a[1]<=a[2] || a[0]+a[2]<=a[1] || a[1]+a[2]<=a[0])
				System.out.println("Wrong!!");
			else
				System.out.println("OK");
			
		}
	}
}