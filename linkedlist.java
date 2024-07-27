import java.util.*;
class linkedlist
{
    public static void main(String [] args)
    {
        LinkedList<String> l1 = new LinkedList<String>();
        l1.add("a");
        l1.add("b");
        l1.addLast("c");
        l1.addFirst("d");
        l1.add(2,"e");
        System.out.println(l1);

        l1.remove("b");
        l1.remove("3");
        l1.removeFirst();
        l1.removeLast();
        System.out.println(l1);
    }
}
