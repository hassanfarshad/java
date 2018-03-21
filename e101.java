import java.util.*;
class e101
{
    public static void main(String aa[])
    {
   Scanner s=new Scanner(System.in);
   int a=s.nextInt();
   while(a!=1)
   {
       if(a%2!=0)
       {
         int c=a;
          break;
       }
       a=a/2;

   }
  System.out.println(a);
    
   
           
   }
}
