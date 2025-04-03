import java.io.*; 
class Num
{
	public static void main (String args[])
	{
	try
	{
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);	
	System.out.println(" Sum of Number");
	System.out.println("-----------------");
	System.out.println("Enter the value");
	String s1=br.readLine();
	int n=Integer.parseInt(s1); 
	System.out.println("Result");
	int v= n*(n+1)/2;
	System.out.println("Sum of Value:" + v);
	int S= n*(n+1)*(2*n+1)/6;
	System.out.println("Sum of Square:" + S);
	int c=(n*(n+1)/2)*(n*(n+1)/2); 
	System.out.println("Sum of cube:" + c);
	}
	catch(Exception e)
	{
	System.out.println("Error:"+e.getMessage());
	}
	}  
}