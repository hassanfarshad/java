import java.io.*;
import java.util.Scanner;
class e32
{
	public static void main(String args[])
	{
                 String s="hai how are u";
 
		int c=1;
		for (int i=0;i<s.length()-1;i++)
		{
			if((s.charAt(i)==' ')&&(s.charAt(i + 1)!=' '))
			{
				c++;
			}
		}
 		System.out.println(c);
	}

}
