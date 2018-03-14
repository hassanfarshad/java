import java.util.*;
import java.lang.*;
import java.io.*;
class e85
{
	public static void main (String[] args)
	{
		String c="";
		String d="";
		Scanner s=new Scanner(System.in);
		String a=s.nextLine();
		char[] b=a.toCharArray();
		for(int i=0;i<b.length;i++)
		{
			if(i%2==0)
			{
                                        c=c+b[i];
				
			}
                                    else
                                    {
                                        d=d+b[i];
                                    }
                        }
                        System.out.printf("%s %s",c,d);
	}
}
