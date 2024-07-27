

class container
{
   
    void call()
    {
        String a=new String("hello");
        System.out.println(a.length());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        //System.out.println(a.trim());

        double s=9.10;
        double z=Math.floor(s);
    
        System.out.println(z);
    }
}

public class stringclass {
    public static void main(String[] args) {
        container c=new container();
        c.call();
    }
}
