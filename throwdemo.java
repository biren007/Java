class throwdemo
{
    public static void main(String[] args)
    {
        try{
            
            int k=3;
            if(k<10)
            {
                throw new ArithmeticException();
            }
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(ArithmeticException e1){
            //System.out.println(e1);
            System.out.println("using throw");
        }
        finally
        {
            System.out.println("i am in final");
        }
    }
}