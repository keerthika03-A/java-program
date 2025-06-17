import java.io.*;

class Salary 
{
    public static void main(String args[]) throws IOException 
    {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Provident International [P] Ltd");
        System.out.println("Ongur, Villupuram");
        System.out.println("------------------------------");
        System.out.println("SALARY BILL RECEIPT");
        System.out.println("------------------------------");

        System.out.print("Enter the emp ID: ");
        String s1 = br.readLine();

        System.out.print("Enter the emp name: ");
        String s2 = br.readLine();

        System.out.print("Enter the salary: ");
        String s3 = br.readLine();
        int n = Integer.parseInt(s3);

        System.out.println("\nINCOME");
        int bonus = n * 20 / 100;
        System.out.println("Bonus: " + bonus);
    }
}
