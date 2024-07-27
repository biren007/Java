class multithreadingdemo implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println("thread"+Thread.currentThread().getId());
        } 
        catch(Exception e)
        {
            System.out.println("exception caught");
        }
    }
}
public class multiThreading2
{
    public static void main(String[] args)
    {
        int n=8;
        for(int i=0;i<n;i++)
        {
           Thread obj=new Thread(new multithreadingdemo());
           obj.start();
        }
    }
}