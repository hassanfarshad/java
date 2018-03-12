import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
class e80
{
	public static void main(String args[])
	{
		int i;
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		  int b[]=new int[a];
		for(i=0;i<b.length;i++)
		{
			if(b[i]%2!=0)
			{
				System.out.println(b[i]);
			}
		}
	}
}
