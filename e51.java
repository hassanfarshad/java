import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class e51
{
     public static void main(String args[])
     {
     Scanner s=new Scanner(System.in);
     int b=s.nextInt();
     String a=String.valueOf(b);
     char c[]=a.toCharArray();
     for(int i=0;i<c.length;i++)
     {
         System.out.printf("%c\t",c[i]);
     }
}
}
