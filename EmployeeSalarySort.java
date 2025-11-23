package ds_practical;
import java.util.Scanner;

public class EmployeeSalarySort
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number of Employees whose Salary has to be sort: ");
		int n = sc.nextInt();

		float A[] = new float[n];
		float temp = 0;
		
		
		System.out.print("Enter Employee Salaries to sort: ");
		for(int i=0; i<n; i++)
		{
			A[i] = sc.nextFloat();
		}

		for(int k=0; k<n; k++)
		{
			for(int j=k+1; j<n; j++)
			{
				if(A[k]>A[j])                   //For Descending order condition -> if(A[k]<A[j])
				{
					temp = A[k];
					A[k] = A[j];
					A[j] = temp;
				}
			}
		}

		System.out.println("Employee Salary After Sorting: ");
		for(int i=0; i<n; i++)
		{
			System.out.println(A[i]);
		}

		System.out.println("Top 5 Salaries are: ");
		for(int i = n-1; i >= n-5; i--)             //For descending order for(int i=0; i<=4; i++)
		{
			System.out.println(A[i]);
		}
	}
}