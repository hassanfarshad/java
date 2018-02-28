import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class e53
{
     public static void main(String args[])
     {
     	int c=0;
     Scanner s=new Scanner(System.in);
     int[] a= new int[5];
     for (int i=0;i<3;i++)
     {
        a[i]=s.nextInt();
        c=c+a[i];
     }
     System.out.println(c);
    }
}
