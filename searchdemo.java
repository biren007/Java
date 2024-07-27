
import java.util.*;
class searchdemo
{
	public static void main(String[] args)
	{
        int x;
        int res;
        int[] no=new int[10];int t=0;
        System.out.println("Enter 10 values");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter val:");
            no[i]=sc.nextInt();
        }
        System.out.println("Enter value you want to search:");
        x=sc.nextInt();
        for(int i=0;i<10;i++)
        {
            if(x==no[i])
            {
                res=no[i];
                System.out.println("you searched:"+res);
                t=1;
                break;
            }
        }
        if(t==0)
        {
             System.out.println("value not found");
        }
        else
        {
             System.out.println("value found");
        }
        
	}
}