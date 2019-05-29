import java.util.Scanner;
public class Main 
{
	
	public static<T> void swap( T[] array,int indexA , int indexB )
	{
		T temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}
	
	public static void main(String[] args)	
	{
		Scanner scanner = new Scanner(System.in);
		int n1 = scanner.nextInt();
		for(int i=0;i<n1;i++)
		{
			int n2 = scanner.nextInt();
			Integer[] a = new Integer[n2];
			
			for(int j=0;j<n2;j++)
				a[j] = scanner.nextInt();
			
			int count = 0;
			
			
			//Bubble sort 
			for (int j = 0; j < n2; j++)
			{
				for (int k = j; k < n2; k++)
				{
					if (a[j] > a[k]) 
					{
						swap(a , j , k);		
						count++;
					}
				}
			}
			//System.out.println(Arrays.toString(a));
			System.out.println("Optimal train swapping takes "+count+" swaps.");
			
		}		
	}
}

