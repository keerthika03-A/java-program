import java.io.*; 
class circle
{
	public static void main (String args[])
	{
	try
	{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);	
	System.out.println("Circle program");
	System.out.println("-----------------");
	System.out.println("Enter a r value:");
	String s1=br.readLine();
	int r=Integer.parseInt(s1); 
	System.out.println("Enter a pi value");
	String s2=br.readLine();
	int b=Integer.parseInt(s2);
	System.out.println("Result");
	int a=b*r*r;
	System.out.println("Area of Circle:"+a);
	int c=2*b*r;
	System.out.println("perimeter of Circle:" + c);
	}
	catch(Exception e)
	{
	System.out.println("Error:"+e.getMessage());
	}
	}  
}