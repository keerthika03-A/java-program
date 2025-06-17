import java.io.*;
class table
{
public static void main (String[] args)
{
	try{
		
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Table");
        System.out.println("-----------------------");
        System.out.println("Enter the Number:");
        String s1 = br.readLine();
        int n = Integer.parseInt(s1);
        System.out.println("5th TABLE");
        System.out.println("-----------------------");
	for(int i=1;i<=10;i++)
	{
		System.out.println(i+"x"+n+"="+(i*n));
	}

	}
	catch(Exception e)
	{
		System.out.println("error:"+e.getMessage());
	}
}
}
