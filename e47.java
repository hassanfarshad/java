import java.io.*;
import java.util.Scanner;
class e47
{
	public static void main(String[] args)
	{
		int d,e;
		Scanner k=new Scanner(System.in);
		System.out.println("Enter the values:");
		int a=k.nextInt();
		int[] c=new int[a];
		for(int i=0;i<a;i++)
		{
			c[i]=k.nextInt();
		}
		 d=c[0];
		 for(int i=0;i<a;i++)
		 {
		 	if(d<c[i])
		 	{
		 		d=c[i];
		 	}
		 }
		 System.out.println("Highest is "+d);
		  e=c[0];
		 for(int i=0;i<a;i++)
		 {
		 	if(e>c[i])
		 	{
		 		e=c[i];
		 	}
		 }
		System.out.println("lowest is "+e);
	}
}
