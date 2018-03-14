import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class e90
{
     public static void main(String args[])
     {
        Scanner s=new Scanner(System.in);
        String a=s.next();
        char b[]=a.toCharArray();
        for(int i=0;i<b.length;i++)
        {
            if(Character.isDigit(b[i]))
            {
                System.out.print(b[i]);
            }
        }
    }
}
