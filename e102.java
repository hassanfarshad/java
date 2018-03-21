import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class e102 
{
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    String a=s.next();
    int d=s.nextInt();
    String h=new StringBuffer(a).reverse().toString();
    char f[]=h.toCharArray();
    d=d-1;
    for(int i=0;i<f.length;i++)
    {
           if(i==d)
           {
               System.out.println(f[i]);
           }
    }
   
           
   }
}
