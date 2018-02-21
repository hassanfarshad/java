import java.util.Scanner;
import java.io.*;
class e34
{
	public static void main(String args[])
	{ 
		int count=0;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the sentance:");
		String a=c.nextLine();
		String d[]=a.split("\\.");
		for(int i=0;i<d.length;i++)
		{
                          count++;
                        }
		System.out.println(count);
	}
}
