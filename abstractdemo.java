abstract class a
{
    abstract void callme();
}
class b extends a{
    void callme()
    {
        System.out.println("method of B");
    }
}
class abstractdemo
{
    public static void main(String[] args) {
        b obj=new b();
        obj.callme();
    }
}