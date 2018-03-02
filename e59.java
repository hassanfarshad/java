import java.io.*;
import java.util.Scanner;
class e59
{
	public static void main(String args[])
	{
		int i,m;
		int[] b=new int[20];
		Scanner d=new Scanner(System.in);
		int a=d.nextInt();
		for(i=0;i<a;i++)
		{
		b[i]=d.nextInt();
		}
		m=b[0];
		for(i=0;i<a;i++)
		{
		if(m<b[i])
		{
			m=b[i];
		}
		}
			System.out.println(m);
	}
}
