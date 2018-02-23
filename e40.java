import java.io.*;
import java.util.Scanner;
class e40
{
	public static void main(String args[])
	{
		Scanner m=new Scanner(System.in);
		System.out.println("Enter the value   :");
		int a=m.nextInt();
		int b=0,i;
		int c=1;
		int d;
		for(i=0;i<=a;i++)
		{
			System.out.println(b);
			d=b+c;
			b=c;
			c=d;
		}
	}
}
