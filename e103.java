import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class e103
{
    public static void main(String args[])
    {
    Scanner s=new Scanner(System.in);
    String a=s.nextLine();
    String h[]=a.split("\\s+");
    for(int i=0;i<h.length;i++)
    {
        char c=h[i].charAt(0);
        char t=Character.toUpperCase(c);
        h[i]=h[i].replace(c, t);
    }
    for(String j:h)
    {
        System.out.printf("%s ", j);
    }
   }
}
