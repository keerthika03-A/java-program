import java.io.*;
class sum
{
public static void main (String[] args)
{
	try{
		
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Sum of N-Number");
        System.out.println("-----------------------");
        System.out.println("Starting Range:");
        String s1 = br.readLine();
        int a = Integer.parseInt(s1);
	System.out.println("Ending Range:");
        String s2 = br.readLine();
        int b = Integer.parseInt(s2);
	System.out.println("CALCULATE SUM");
        System.out.println("Print the Series & Sum:");
	for(int i=a;i<=b;i++)
	{
		if(i%3==0||i%5==0)
		{
		System.out.println(i);
		}
	}

	}
	catch(Exception e)
	{
		System.out.println("error:"+e.getMessage());
	}
}
}
