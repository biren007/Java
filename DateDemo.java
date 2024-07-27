import java.util.*;
class DateDemo
{
    public static void main(String[] args)
    {
        Date d1=new Date(2000,11,21);
        Date d2=new Date();
        Date d3=new Date(2010,1,3);
        boolean a=d3.after(d1);
        System.out.println("date d3 comes after"+"date d2"+a);
        System.out.println("date is"+d2);
        boolean b=d3.before(d2);
        System.out.println("date d3 comes before"+"date d2"+b);
    }
}