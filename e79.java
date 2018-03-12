import java.io.*;
import java.util.Scanner;
class e79
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=a*b;
		double d=Math.sqrt(c);
		double e=d*d;
		if(c==e)
		{
			System.out.println("YES");
			
		}
		else
		{
			System.out.println("NO");
		}
	}
}
