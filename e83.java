import java.io.*;
import java.util.Scanner;
class e83
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		char c=s.next().charAt(0);
		int b=s.nextInt();
		switch(c)
		{
			case '/':
			int e=a/b;	
			System.out.println(e);
			break;
			case '%':
			int d=a%b;
			System.out.println(d);
			break;
		}
		
	}
}
