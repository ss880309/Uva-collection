import java.util.Scanner;
public class Main 
{	
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		int z = scanner.nextInt();
		for(int i=1;i<=z;i++)
		{
			
			int ax1 = scanner.nextInt();
			int ay1 = scanner.nextInt();
			int ax2 = scanner.nextInt();
			int ay2 = scanner.nextInt();
			
			int bx1 = scanner.nextInt();
			int by1 = scanner.nextInt();
			int bx2 = scanner.nextInt();
			int by2 = scanner.nextInt();
			
			int hig = 0;
			int low = (ax2-ax1)*(ay2-ay1) + (bx2-bx1)*(by2-by1) ;
			int no  = 100*100;
			
			//  (ax,ay)  (bx,by)  針對高安全區
			int ax = Math.min(ax2,bx2);
		    int ay = Math.min(ay2,by2);
		    int bx = Math.max(ax1,bx1);
		    int by = Math.max(ay1,by1);
			
		    if( ax > bx && ay > by )
		    	hig = (ax-bx)*(ay-by);
		    
		    if( hig > 0 )
		    	low -= 2 * hig;
		    
		    no-=low;
		    
		    if( hig > 0 )
		    	no -= hig;
		    
		    System.out.println("Night "+i+": "+hig+" "+low+" "+no);
			//int hig = bx1<ax2 && by1<by2 ? (ax2-bx1)*(ay2-by1) : 0;
			//int low = (ax2-ax1)*(ay2-ay1) + (bx2-bx1)*(by2-by1) - 2*hig;
			//int no  = 100*100 - low - hig ;
			
			//System.out.println("Night "+i+": "+hig+" "+low+" "+no);
			//ATCG
			/*
			System.out.print(i!=1?"\n":"");
			
			int n = scanner.nextInt();//長度
			int m = scanner.nextInt();//幾行
			String[] s = new String[m];
			int[] count = new int[m];
			int max = -1000;
			int min =  1000;
			
			for(int j=0 ; j<m ; j++)
			{
				s[j] = scanner.next();
				for(int k=0 ; k<n-2 ; k++)
				{
					for(int l=k+1 ; l<=n-1 ; l++)
					{
						if(s[j].charAt(k) > s[j].charAt(l))
						{
							count[j]++;
						}
					}
				}
				max = Math.max(max, count[j]);
				min = Math.min(min, count[j]);
			}
			
			for(int j=min;j<=max;j++)
			{
				for(int k=0;k<count.length;k++)
				{
					if(j==count[k])
					{
						System.out.println(s[k]);
					}	
				}
			}
			*/
			
				
			
			
			/*
			for(i=0; i<m; i++)  
	        {  
	            cin>>w[i].str  
	            w[i].count=0;  
	            for(j=0; j<=n-2; j++)   
	            {  
	                for(k=j+1; k<=n-1; k++)  
	                {  
	                    if(w[i].str[j]>w[i].str[k]) w[i].count++;  
	                }  
	            }  
	        }  
			*/			
			
			/*
			10 6
			AACATGAAGG
			TTTTGGCCAA
			TTTGGCCAAA
			GATCAGATTT
			CCCGGGGGGA
			ATCGATGCAT
			*/
			
			
			
			
		}
	}
}