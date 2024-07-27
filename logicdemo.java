class logicdemo
{
    public static void main(String[] args)
    {
        int a=15,b=30,c=15,d=30;
        if(a==c && b==d)
        {
            System.out.println("equal");
        }
        else if(a<b || b<c)
        {
            System.out.println("a is smaller than any other value");
        }
        else if(a!=b)
        {
            System.out.println("value of a and b is not equal");
        }
    }
}