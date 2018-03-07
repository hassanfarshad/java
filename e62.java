import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class e62 
{
     public static void main(String aa[])
     {
     int n=1;;
     Scanner s=new Scanner(System.in);
     String d=s.next();
     char a[]=d.toCharArray();
     for(int i=0;i<a.length;i++){
       if(a[i]!='0'&&a[i]!='1'){
           n=0;
           break;
       }
         }

       if(n==0)
       {
          System.out.println("No");
       }
 else{
      System.out.println("Yes");
 }
}
}
