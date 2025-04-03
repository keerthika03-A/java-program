import java.io.*; 
class Square_Rectangle
{
	public static void main (String args[])
	{
	try
	{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);	
	System.out.println("Square&Rectangle");
	System.out.println("-----------------");
	System.out.println("Enter the value");
	String s1=br.readLine();
	int a=Integer.parseInt(s1);
	System.out.println("Enter the l value:");
	String s2=br.readLine();
	int l = Integer.parseInt(s2);
	System.out.println("Enter the b value:");
	String s3=br.readLine();
	int b=Integer.parseInt(s3);
	System.out.println("Result");
	int A=a*a;
	System.out.println("Area of Square:" + A);
	int p=4*a;  
	System.out.println("perimeter of area:" + p);
	int x=l*b;
	System.out.println("Area of Rectangle:" + x);
	int y=2*(l+b);
	System.out.println("perimeter of Rectangle:" + y);
	}
	catch(Exception e)
	{
	System.out.println("Error:"+e.getMessage());
	}
	}  
}	