import java.util.Scanner;
import java.io.*;
class e37
{
	public static void main(String args[])
	{ 
		int temp;
		Scanner c1=new Scanner(System.in);
		System.out.println("Enter the value 1:");
		int a=c1.nextInt();
		System.out.println("Enter the value 2:");
		int b=c1.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println(+a);
		System.out.println(+b);
	}
}
