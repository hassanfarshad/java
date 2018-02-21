import java.util.Scanner;
import java.io.*;
class e39
{
	public static void main(String args[])
	{ 
		Scanner c1=new Scanner(System.in);
		int a=c1.nextInt();
		int b=c1.nextInt();
		int c=c1.nextInt();
		int d=c1.nextInt();
		int e=c1.nextInt();
		int f=c1.nextInt();
		int g=c1.nextInt();
		int h=c1.nextInt();
		int i=c1.nextInt();
		int j=c1.nextInt();
		if(a>b&&a>c&&a>d&&a>e&&a>f&&a>g&&a>h&&a>i&&a>j)
		{
			System.out.println("A is greater"     +a);
		}
		else if(b>c&&b>d&&b>e&&b>f&&b>g&&b>h&&b>i&&b>j)
		{
				System.out.println("B is greater"     +b);
		}
		else if(c>d&&c>e&&c>f&&c>g&&c>h&&c>i&&c>j)
		{
				System.out.println("C is greater"     +c);
		}
		else if(d>e&&d>f&&d>g&&d>h&&d>i&&d>j)
		{
				System.out.println("D is greater"     +d);
		}
		else if(e>f&&e>g&&e>h&&e>i&&e>j)
		{
				System.out.println("E is greater"     +e);
		}
		else if(f>g&&f>h&&f>i&&f>j)
		{
				System.out.println("F is greater"     +f);
		}
		else if(g>h&&g>i&&g>j)
		{
				System.out.println("G is greater"     +g);
		}
		else if(h>i&&h>j)
		{
				System.out.println("H is greater"     +h);
		}
		else if(i>j)
		{
				System.out.println("I is greater"     +i);
		}
		else
		{
		                        System.out.println("J is greater"     +j);	
		}
	}
}
