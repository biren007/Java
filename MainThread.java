class MyThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("user thread daemon or not");
    }
}
class MainThread
{
    public static void main(String[] args)
    {
        MyThread mt=new MyThread();
        mt.start();
        System.out.println("before calling set daemon");
        System.out.println("is"+mt.getName()+"a daemon thread"+" : "+mt.isDaemon());
       
        mt.setDaemon(true);
        System.out.println("after calling set daemon");
        System.out.println("is"+mt.getName()+"a daemon thread"+" : "+mt.isDaemon());
        //System.out.println("is"+Thread.currentThread().getName()+"a daemon thread"+Thread.currentThread().isDaemon());
    }
}