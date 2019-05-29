import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);  
        while(scanner.hasNext())
        {
        	String a=scanner.next();
        	String b=scanner.next();
        	int carry=0;
        	//if((a+b).equals("00"))
        	//	break;
        	if((Integer.parseInt(a)+Integer.parseInt(b))==0)
        		break;
        	for(int i=a.length()-1;i>-1;i--)
        	{
        		if((a.charAt(i)-'0')+(b.charAt(i)-'0')>9)
        			carry++;
        	}
			if(carry==0)
				System.out.printf("No carry operation.\n");
			else if(carry==1)
				System.out.printf("%d carry operation.\n",carry);
			else if(carry>1)
				System.out.printf("%d carry operations.\n",carry);
        }
        //System.out.println("end"+System.currentTimeMillis()/1000); 
    }
}
