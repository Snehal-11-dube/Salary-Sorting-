package ds_practical;
import java.util.Scanner;

public class SalarySort
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of Employees Whose Salary has to be Sorted: ");
		int n = sc.nextInt();

		float A[] = new float[n];
		float temp = 0;

		System.out.println("Enter Salaries to sort: ");
		for(int i=0; i<n; i++)
		{
			A[i] = sc.nextFloat();
		}

		for(int i=0; i<n; i++)
		{
			int minIdx = i;

			for(int j=i+1; j<n; j++)
			{
				if(A[j] < A[minIdx])                    //For descending order condition -> if(A[j]>A[minIndex])
				{
					minIdx = j;
				}
			}

			temp = A[i];
			A[i] = A[minIdx];
			A[minIdx] = temp;
		}

		System.out.println("Employee Salaries After Sorting: ");
		for(int i=0; i<n; i++)
		{
			System.out.println(A[i]);
		}


		System.out.println("Top 5 Salaries are: ");
		for(int i = n-1; i >= n-5; i--)           //For descending order for(int i=0; i<=4; i++)
		{
			System.out.println(A[i]);
		}
	}
}