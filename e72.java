import java.util.*;
import java.lang.*;
import java.util.ArrayList;
class e72
{
     public static void main(String args[])
     {
     int c=0;
     Scanner s=new Scanner(System.in);
     String a=s.nextLine();
     char[] b=a.toCharArray();
     for(int i=0;i<a.length();i++)
     {
       if((b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u')||(b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U')) 
      {
     	c=1;
     	break;
     }
     }
     if(c==1)
     {
     System.out.println("YES");
     }
     else
     {
     System.out.println("NO");	
     }
     }
}
