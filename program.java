import java.io.*;
class Arthi
{
	public static void main(String args[])
	{
	try
	{
	InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br= new BufferedReader(isr);
    System.out.println("ARITHIMETIC OPERATION");
    System.out.println("----------------------");
    System.out.println("Enter the Frist No:");
	String s1=br.readLine();
	int a=Integer.parseInt(s1);
	System.out.println("Enter the second No:");
	String s2=br.readLine();
	int b=Integer.parseInt(s2);
	System.out.println("Result");
	int c=a+b;
	System.out.println("Add:"+c);
	c=a-b;
	System.out.println("sub:"+c);
	}catch(Exception e)
	{
	System.out.println("Error:"+e.getMessage());
	}
	}
}
    	
		