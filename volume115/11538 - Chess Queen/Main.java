import java.util.*;
public class Main
{
	/*
	
	思路：分三种情况:
	
	1.同一行上的相互攻击：第一个皇后有n*m种方法，第二个皇后只有(m-1)，同行不同列的方法
	
	2.同一列上的相互攻击：同上
	
	3.同一对角线上的攻击：设n<=m,那么 \ 对角线有：1,2,3,,,,n-1,n(m-n+1个),n-1,,,,2,1
	
	另一个方向的也是如此，那么确定了第一个放皇后的位置后，另一个就好确定了
	
	结果是：2 *（2*i(i-1){i 从1到n-1} + (n-m+1)*n*(n-1)）
	
	*/
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
        	long m = sc.nextLong();
        	long n = sc.nextLong();
        	
        	if(m==0&&n==0)
        		break;
        		
        	if(n>m)
        	{
        		long temp = m;
        		m = n;
        		n = temp;
        	}
        	
        	System.out.println( m*n*(m+n-2) + 2*n*(n-1)*(3*m-n-1)/3 );
        }
    }
}

//== 以上為雙和範例
/*
//使用Java的考生請注意，最外層的類別(class)需命名為 main 。
//如果遇到超乎想像的狀況，請更改編譯器試看看!! 各編譯器特性不同!!
//預設測資、隨機測資、固定測資是用來幫助除錯用的。批改時，只看暗中測資是否通過!!

//*/
