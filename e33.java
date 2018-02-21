import java.util.Scanner;
import java.io.*;
class e33
{
	public static void main(String args[])
	{ 
		int count=0;
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the sentance:");
		String a=c.nextLine();
		for(int i=0;i<a.length();i++)
		{
                        if(a.charAt(i)==' ')
                        {
                          count++;
                        }
		}
		System.out.println(count);
	}
}
