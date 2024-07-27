import java.util.*;
class hashdemo
{
    public static void main(String[] args)
    {
        Hashtable<Integer,String> map=new Hashtable<Integer,String> ();
        map.put(100,"amit");
        map.put(102,"ravi");
        map.put(101,"vijay");
        map.put(103,"rahul");
        System.out.println("before remove"+map);
        map.remove(102);
        System.out.println("after remove"+map);
        System.out.println(map.getOrDefault(101,"no default"));
        System.out.println(map.getOrDefault(105,"NO default"));
    }
}