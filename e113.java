
import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class e113
{
    public static void main(String aa[])
    {
    	int i;
   int count=0;
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int k=s.nextInt();
    int b[]=new int[a];
    for(i=0;i<b.length;i++)
    {
        b[i]=s.nextInt();
    }
    for(i=0;i<b.length;i++)
    {
        if(b[i]==k)
        {
        		count++;
        }
    }
      System.out.println(count);       
   }
}
