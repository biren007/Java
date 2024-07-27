class IIBdemo
{
    {
        System.out.println("IIB block one");
    }

    {
        System.out.println("IIB block two");
    }

    IIBdemo()
    {
        System.out.println("Constructor called");
    }

    {
        System.out.println("IIB block three");
    }

    public static void main(String [] args)
    {
        IIBdemo obj =new IIBdemo();
    }
}