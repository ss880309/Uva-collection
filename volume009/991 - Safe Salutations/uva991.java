import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        int n;
        int f[]=new int[10];
        f[0] = f[1] = 1; 
        f[2] = 2;  
        for (int i = 3; i < 10; i ++)  
        {
            for(int j = 0; j < i; j ++) 
            {  
                f[i] = f[i] + ( f[j] * f[i - j - 1] );  
            }  
        }
        int t=0;
        while (scanner.hasNext())//~scanf("%d", &n) 
        {  
            n=scanner.nextInt();
            if(t!=0)
                System.out.println();   
            t++;
            System.out.printf("%d\n", f[n]);  
        }
    }   
}
//參考->卡特蘭數
//f(n)=f(0)f(n-1)+f(1)f(n-2)+......+f(n-1)f(0)