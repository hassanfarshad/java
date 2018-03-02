import java.io.*;
import java.util.Scanner;
class e58
{
	public static void main(String args[])
	{
		Scanner d=new Scanner(System.in);
		int a=d.nextInt();
		int b=d.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(+a+" "+b);
	}
}
