import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) 
		{
			int u=1,n=2,w=3,e=4,s=5,d=6,t;//上北西東南下
			int N = sc.nextInt();
			if(N==0)
				break;
			for(int i=0;i<N;i++)
			{
				String a = sc.next();
				switch(a)
				{
					case "north":
						t=u;	u=s;	s=d;	d=n;	n=t;
						break;
					case "south":
						t=u;	u=n;	n=d;	d=s;	s=t;
						break;
					case "east":
						t=u;	u=w;	w=d;	d=e;	e=t;
						break;
					case "west":
						t=u;	u=e;	e=d;	d=w;	w=t;
						break;	
				}
			}
			System.out.println(u);
		}
	}
}