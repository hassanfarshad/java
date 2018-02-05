import java.io.*;
import java.util.Scanner;
class e9
{
	public static void main(String args[])
	{int count=0;
		Scanner d1=new Scanner(System.in);
		System.out.println("Enter number of digits");
		int a=d1.nextInt();
		while(a!=0)
		{
			a/=10;
			++count;
			}
		System.out.println(+count);
		
		}
}
