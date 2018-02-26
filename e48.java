import java.io.*;
import java.util.Scanner;
class e48
{
	public static void main(String[] args)
	{
		int d=0,e=0;
		Scanner k=new Scanner(System.in);
		System.out.println("Enter the values:");
		int a=k.nextInt();
		int[] c=new int[a];
		for(int i=0;i<a;i++)
		{
			c[i]=k.nextInt();
			d+=c[i];
		}
		e=d/a;
		System.out.println(e);
	}
}
