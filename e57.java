import java.io.*;
import java.util.Scanner;
class e57
{
	public static void main(String args[])
	{
		int temp;
		Scanner d=new Scanner(System.in);
		int a=d.nextInt();
		int b=d.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println(+a+" "+b);
	}
}
