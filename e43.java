import java.io.*;
import java.util.Scanner;
class e40
{
	public static void main(String args[])
	{
		String b;
		Scanner m=new Scanner(System.in);
		System.out.println("Enter the String   :");
		String a=m.nextLine();
		b=a.replaceAll(" ","");
		System.out.println(b);
	}
}
