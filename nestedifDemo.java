import java.util.*;
class nestedifDemo
{
    public static void main(String[] args)
    {
        String gender;
        int salary;
        int ta;
	   int da;
        int sal;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your gender M or F");
        gender=sc.nextLine();

        if(gender.equals("M"))
        {
            System.out.println("enter your salary");
            salary=sc.nextInt();
           if(salary<10000)
           {
                ta=(salary*5)/100;
                da=(salary*10)/100;
                sal=salary+ta+da;
                System.out.println("net salary is"+sal);
           } 
          else if(salary>=10000 && salary<60000)
           {
                ta=(salary*6)/100;
                da=(salary*11)/100;
                sal=salary+ta+da;
                System.out.println("net salary is"+sal);
           } 
	     else if(salary>=60000)
           {
                ta=(salary*7)/100;
                da=(salary*12)/100;
                sal=salary+ta+da;
                System.out.println("net salary is"+sal);
           } 
        }
	 else if(gender.equals("F"))
        {
          System.out.println("enter your salary");
          salary=sc.nextInt();
           if(salary<10000)
           {
		        ta=(salary*4)/100;
		        da=(salary*9)/100;
		        sal=salary+ta+da;
                System.out.println("net salary is"+sal);
           } 
          else if(salary>=10000 && salary<60000)
           {
	        	ta=(salary*3)/100;
		     da=(salary*8)/100;
	        	sal=salary+ta+da;
                System.out.println("net salary is"+sal);
           } 
	      else if(salary>=60000)
           {
	       	   ta=(salary*2)/100;
		        da=(salary*7)/100;
		        sal=salary+ta+da;
                System.out.println("net salary is"+sal);
           } 
        }
	   else
       {
		    System.out.println("invalid gender");
	   }
    }
}