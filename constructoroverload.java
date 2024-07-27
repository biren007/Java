class constructorcontainer
{
    constructorcontainer()
    {
        System.out.println("this is constructor 1");
    }
    constructorcontainer(int a,int b)
    {
        int sum=a+b;
        System.out.println(sum);
    }
    constructorcontainer(String a,String b)
    {
        System.out.println(a+" "+b);
    }

}

public class constructoroverload
{
    public static void main(String[] args) {
        new constructorcontainer();
        new constructorcontainer(10,20);
        new constructorcontainer("a","b");
    }
}
