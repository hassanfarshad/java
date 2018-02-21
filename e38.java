import java.util.Scanner;
import java.io.*;
class e38
{
	public static void main(String args[])
	{ 
		Scanner c1=new Scanner(System.in);
		System.out.println("Enter the value 1:");
		int a=c1.nextInt();
		System.out.println("Enter the value 2:");
		int b=c1.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(+a);
		System.out.println(+b);
	}
}
