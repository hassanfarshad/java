import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class e75
{
     public static void main(String args[])
     {
     Scanner s=new Scanner(System.in);
     String a=s.nextLine();
     int c=a.length();
     int d=c/2;
     char[] b=a.toCharArray();
     for(int i=0;i<a.length();i++)
     {
     	if(i==d)
     	{
     		b[i]='*';
     	}
     }
     System.out.println(b);	
     }
}
