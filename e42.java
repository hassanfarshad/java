import java.io.*;
import java.util.Scanner;
class e40
{
	public static void main(String args[])
	{
		int i,c,d;
		Scanner m=new Scanner(System.in);
		System.out.println("Enter the String   1:");
		String a=m.nextLine();
		System.out.println("Enter the String   2:");
		String b=m.nextLine();
		c=a.length();
		d=b.length();
		if(c>d)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(b);
		}
		
	}
}
