class multithreadingdemo extends Thread
{
    public void run()
    {
        try
        { 
            System.out.println("thread"+ currentThread().getId() +" : "+ getState()); 
        } 
        catch(Exception e)
        {
            System.out.println("exception caught");
        }
    }
}
public class multiThreading
{
    public static void main(String[] args)
    {
        int n=5;
        for(int i=0;i<n;i++)
        {
            multithreadingdemo obj=new multithreadingdemo();
            obj.start();
        }
    }
}