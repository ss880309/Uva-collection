import java.util.Arrays;
import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//以為是和解工作的爭執  你現在叫我比較三角形?
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