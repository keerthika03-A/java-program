import java.io.*;
class keerthi
{
	public  static void main(String args[])
	{
	try
	{	
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	System.out.println("keerthi super market");
	System.out.println("No.2., Orathi Main Road Villupuram");
	System.out.println("-----------------------------------");
	System.out.println("BILL");
	System.out.println("-----------");
	System.out.println("Enter the Serial No:");
	String s1=br.readLine();
	System.out.println("Enter the particulars:");
	String s2=br.readLine();
	System.out.println("Enter the rate:");
	String s3=br.readLine();
	int a=Integer.parseInt(s3);
	System.out.println("Enter the Quantity:");
	String s4=br.readLine();
	int b=Integer.parseInt(s4);
	System.out.println("Result");
	int c=a*b;
	System.out.println("total:"+c);
	int d= c*10/100;
	System.out.println("GST(10%):"+d);
	int e=c+d;
	System.out.println("Grant Total:"+e);
	System.out.println("-------------------");
	System.out.println("Thanks!Visit again!");
	System.out.println("-----***------");
	}
	catch(Exception e)
	{
	System.out.println("Error:+e.getMessages");
    }	
}
}
	
		