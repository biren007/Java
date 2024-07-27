

class cmdarith
{
	public static void main(String[] args)
	{
        int val1 = Integer.parseInt(args[0]);
        int val2 = Integer.parseInt(args[2]);
        int res;
		if(args[1].equals("+"))
        {
            res=val1+val2;
            System.out.println("sum = "+res);
        }
        else if(args[1].equals("-"))
        {
            res=val1-val2;
            System.out.println("sub = "+res);
        }
        else if(args[1].equals("*"))
        {
            res=val1*val2; 
            System.out.println("mul = "+res);
        }
        else if(args[1].equals("/"))
        {
            res=val1/val2;
            System.out.println("div = "+res);
        }
        else
        {
            System.out.println("Please enter proper sign");
        }
	}
}