class box
{
    double h,w,d;
    box(double a,double b,double c)
    {
        h=a;
        w=b;
        d=c;
    }
    double volume()
    {
        return h*w*d;
    }
}

class parameterized
{
    public static void main(String[] args)
    {
        double vol;
        box b1=new box(10,20,30);
        box b2=new box(1,2,5);
        vol=b1.volume();
        System.out.println("volume of b1="+vol);
        vol=b2.volume();
        System.out.println("volume of b2="+vol);
    }
}