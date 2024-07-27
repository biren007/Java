class StringBufferDemo
{
    public static void main(String [] args)
    {
        StringBuffer s1=new StringBuffer("Computer Science department");
        StringBuffer s2=new StringBuffer("Saurastra Univercity");
        System.out.println("Inserting values"+s1.insert(9,s2));
        System.out.println("appendimg two strings"+s1.append(s2));
    }
}