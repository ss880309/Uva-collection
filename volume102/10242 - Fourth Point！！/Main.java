import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
    {
   		Scanner scanner = new Scanner(System.in);
   		while(scanner.hasNext())
   		{
   			double x1 = scanner.nextDouble();
   			double y1 = scanner.nextDouble();
   			double x2 = scanner.nextDouble();
   			double y2 = scanner.nextDouble();
   			double x3 = scanner.nextDouble();
   			double y3 = scanner.nextDouble();
   			double x4 = scanner.nextDouble();
   			double y4 = scanner.nextDouble();
   			
   			if(x1 == x3 && y1 == y3)
   	            System.out.printf("%.3f %.3f\n", (x2+x4)-x1, (y2+y4)-y1);
   	        else if(x1 == x4 && y1 == y4)
   	        	System.out.printf("%.3f %.3f\n", (x2+x3)-x1, (y2+y3)-y1);
   	        else if(x2 == x3 && y2 == y3)
   	        	System.out.printf("%.3f %.3f\n", (x1+x4)-x2, (y1+y4)-y2);
   	        else
   	        	System.out.printf("%.3f %.3f\n", (x1+x3)-x2, (y1+y3)-y2);

   		}
    }
}