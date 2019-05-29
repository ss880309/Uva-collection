import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
   public static void main(String[] args) throws NumberFormatException, IOException 
   {
   		//Scanner scanner = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n1 = Integer.parseInt(br.readLine());
			//ArrayList<Integer> price = new ArrayList<Integer>();
			for(int i=1;i<=n1;i++)
			{
				int n2 = Integer.parseInt(br.readLine());
				int[] price = new int[n2];
				String temp = br.readLine();
				String[] s = temp.split(" ");
				for(int j=0;j<n2;j++)
					price[j] = Integer.parseInt(s[j]);
				/*
				for(int j=0;j<n2;j++)
					price[j] = scanner.nextInt();
				*/
				Arrays.sort(price);
				if(n2>=3)
				{
					int sum = 0;
					for(int j=n2-1-2;j>=0;j-=3)
						sum += price[j];
					System.out.println(sum);
				}
				else
					System.out.println("0");
			}
		
   }
}