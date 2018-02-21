import java.util.Scanner;
import java.io.*;
class e36
{
	public static void main(String args[])
	{ 
		int c=0;
		Scanner c1=new Scanner(System.in);
		System.out.println("Enter the sentance:");
		String a=c1.nextLine();
		for(int i=0;i<a.length();i++)
		{
		if(a.charAt(i)>='0'&&a.charAt(i)<='9')
			{
                                       c++;
			}
                        }
		System.out.println(c);
	}
}
