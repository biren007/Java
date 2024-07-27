class ABCD implements Runnable
{
    public void run()
    {
        try
        {
            Thread.sleep(100);
        }
        catch(Exception e)
        {
            System.out.println("exception caught");
        }
        System.out.println("the state of thread t1 while it invoked the method join() on thread t2 :"+ThreadState.t1.getState());

        try
        {
            Thread.sleep(200);
        }
        catch(Exception e)
        {
            System.out.println("exception caught");
        }
    }
}

public class threaddemo2 implements Runnable
{
    public static Thread t1;
    public static ThreadState obj;
    public static void main(String[] args)
    {
        //obj=new ThreadState();
        
        System.out.println("the state of thread t1 after spawing it :"+t1.getState());
        t1.start();
        System.out.println("the state of thread t1 after invoking the method start() on it :"+t1.getState());
    }
    public void run()
    {
        ABCD myobj=new ABCD();
        Thread t2=new Thread(myobj);
        System.out.println("the state of thread t2 after spawing it :"+t2.getState());
        t2.start();
        System.out.println("the state of thread t2 after calling the method start() on it :"+t2.getState());

        try
        {
            Thread.sleep(200);
        }
        catch(Exception e)
        {
            System.out.println("exception caught");
        }
        System.out.println("the state of thread t2 when it has completed its execution :"+t2.getState());
    }

}