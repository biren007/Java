class Exceptiondemo
{
    public static void main(String[] args)
    {
        try
        {
            int j=5/0;
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("finally block");
        }
        System.out.println("after finally");
    }
}