class base
{
    int a=69;
    base()
    {
        System.out.println("this is contrcutor of base class");
    }
}
class derived extends base
{
    void call()
    {
         System.out.println(a);
    }
    derived()
    {
        System.out.println("this is contrcutor of derived class");
    }
}
public class inheritancedemo {
    public static void main(String[] args) {
        derived d=new derived();
        d.call();
    }
}
