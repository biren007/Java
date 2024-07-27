
import java.util.Random;
class RandomClassDemo
{
    public static void main(String [] args)
    {
        Random r=new Random();
        System.out.println("A random Int ="+r.nextInt());
        System.out.println("A random Int between 0 to 49 ="+r.nextInt(50));
        System.out.println("A random double "+r.nextDouble());
        System.out.println("A random float "+r.nextFloat());


    }
}