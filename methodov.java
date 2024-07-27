class methodcontainer
{
    public void ok()
    {
        System.out.println("no para");
    }
    public void ok(int a)
    {
        System.out.println(a);
    }
    public void ok(int a,int b)
    {
        System.out.println(a+b);
    }
    public void ok(String a,String b)
    {
        System.out.println(a+b);
    }
}

public class methodov {
    public static void main(String[] args) {
       methodcontainer obj= new methodcontainer();
       obj.ok();
       obj.ok(10);
       obj.ok(10,20);
       obj.ok("aa","aa");
    }

}
