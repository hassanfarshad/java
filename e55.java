import java.io.*;
import java.util.Scanner;
class e55
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		int a=d.nextInt();
		int b=d.nextInt();
		int c=a*b;
		if(c%2==0)
		{
			System.out.println("EVEN");
		}
		else
		{
			System.out.println("ODD");
		}
	}
}
