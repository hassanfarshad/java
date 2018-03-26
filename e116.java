import java.io.*;
import java.util.Scanner;
class e116
{
	public static void main(String args[])
	{
		String a;
		Scanner m=new Scanner(System.in);
		System.out.println("Enter the String   :");
		String b=m.nextLine();
		a=b.replaceAll(" ","");
		System.out.println(a);
	}
}
