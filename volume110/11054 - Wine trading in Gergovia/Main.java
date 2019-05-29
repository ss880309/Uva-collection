/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.math.*;
public class Main 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
	while(sc.hasNextLong())
	{
		long n = sc.nextLong();
                long a[]=new long[100005];
                long sum = 0;
                
		if(n == 0) 
                    break;
                
		for(int i=0;i<n;i++)
			a[i]=sc.nextLong();
                
		for(int i=0;i<n-1;i++)
		{
			a[i+1]+=a[i]; 
                        sum += Math.abs(a[i]);
		}
                
		System.out.println(sum); 
                
	}
    }
}
