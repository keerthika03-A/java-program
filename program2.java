import java.io.*;
class stud
{
	public static void main(String args[])
	{	
	try
	{
    InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	System.out.println("TAKSHASHILA UNIVERSITY");
	System.out.println("------------------------");
	System.out.println("student Mark List");
	System.out.println("Enter the Enroll No:");
	String s1= br.readLine();
	int a=Integer.parseInt(s1);
	System.out.println("Enter the java mark:");
	String s2= br.readLine();
	int b=Integer.parseInt(s2);
	System.out.println("Enter the stud Name");
	String s3= br.readLine();
	System.out.println("Enter the SE Mark:");
	String s4= br.readLine();
	int c=Integer.parseInt(s4);
	System.out.println("Enter the CN Mark:");
	String s5= br.readLine();
	int d=Integer.parseInt(s5);
	System.out.println("Result");
	a=b+c+d;
	System.out.println("Total:"+a);
	d=a/3;
	System.out.println("Average:"+d);
	}
	catch(Exception e)
	{
	System.out.println("Error:"+e.getMessage());
	}	
	}
}
	
	
	