import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class e50
{
     public static void main(String aa[])
     {
     int a,b,c=0;
     Scanner D=new Scanner(System.in);
     a=D.nextInt();
     while(a!=1)
     {
         if(a%2!=0)
         {
             c=1;
         }
         a=a/2;
        }
     if(c==1){
         System.out.println("No");
     }
 else
 {
         System.out.println("Yes");
 }
}
}
