import java.util.Scanner;
public class Main 
{

	public static void main(String[] args) 
	{
		// �o�D�P�_���ƫܤ� �ӥB���J�榡�S�O�T�w��  �i�H�����g�Xfor  �����ܪ�ı�������T�|�X�ӧY�i���P���X
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			//OOO-OOOO
			String s = scanner.next();
			
			int a = (s.charAt(0)-'A')*26*26 + (s.charAt(1)-'A')*26 + (s.charAt(2)-'A');
			int b = (s.charAt(4)-'0')*1000 + (s.charAt(5)-'0')*100 + (s.charAt(6)-'0') * 10 + (s.charAt(7)-'0');
			
			int ans = Math.abs(a-b);
			
			System.out.println(ans<=100?"nice":"not nice");
			
		}
	}
}
