import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class e100
{
    public static void main(String aa[])
    {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    String b=String.valueOf(a);
    char c[]=b.toCharArray();
    int sum=1;
    for(int i=0;i<c.length;i++)
    {
        int p=Character.getNumericValue(c[i]);
        sum=sum*p;
    }
    System.out.println(sum);
   
   
           
   }
}
