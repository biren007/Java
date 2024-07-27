
import java.util.*;
class matrixsum
{
	public static void main(String[] args)
	{
        Scanner sc=new Scanner(System.in);
        int arr1[][]=new int[2][2];
        int arr2[][]=new int[2][2];
        System.out.println("Enter values for Array1:");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                 arr1[i][j]=sc.nextInt();
            }
        }
        
         System.out.println("Enter values for Array2:");
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                 arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("ARRAY1:  ");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr1[i].length;j++)
            {
                 System.out.print(arr1[i][j]+"    ");
            }
            System.out.println();
        }

        System.out.println("ARRAY2:");
        for(int i=0;i<arr2.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)
            {
                 System.out.print(arr2[i][j]+"    ");
            }
            System.out.println();
        }

        System.out.println("SUM OF BOTH ARRAY:");
        for(int i=0;i<arr1.length;i++)
        {
            for(int j=0;j<arr2[i].length;j++)  
            {
                 System.out.print(arr1[i][j]+arr2[i][j]+"    ");
            }
            System.out.println();
        }
        sc.close();
	}
}