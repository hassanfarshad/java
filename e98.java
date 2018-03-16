import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class e98
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int c=1;
		int count=0;
		int b[]=new int[a];
		for(int i=0;i<a;i++)
		{
			b[i]=s.nextInt();
			
		}
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=c)
			{
				count++;
				
			}
			c++;
			
		}
		System.out.println(count);
		
	}
}
