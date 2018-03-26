import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class e114
{
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int c=1;
    int k=s.nextInt();
   for(int i=0;i<=a;i++)
   {
       if(i%2!=0)
       {
            if(c==k)
            {
               System.out.print(i);

           }
            c++;
       }

}
}
}
