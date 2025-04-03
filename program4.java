import java.io.*;
class Electricitybill
{
	public static void main (String args[])
	{
	try
	{
    DataInputStream dis=new DataInputStream(System.in);		
	System.out.println("Government of tamilnadu");
	System.out.println("Electricity bill");
	System.out.println("-----------------");
	System.out.println("Enter the EB-No");
	String s1=dis.readLine();
	int a=Integer.parseInt(s1);
	System.out.println("Enter the customer Name");
	String s2=dis.readLine();
	System.out.println("Enter the prev unit");
	String s3=dis.readLine();
	int x=Integer.parseInt(s3);
	System.out.println("Enter the current unit");
	String s4=dis.readLine();
	int y=Integer.parseInt(s4);
	System.out.println("Result");
	int d= y-x;
	System.out.println("unit consumed:"+d);
	a = d*5;
	System.out.println("Total Amount:"+a);
	}
	catch(Exception e)
	{
	System.out.println("Error:"+e.getMessage());
	}
	}
}

	
	