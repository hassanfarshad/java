import java.util.Scanner;
import java.util.ArrayList;
class Red 
{
  public static void main(String args[])
  {
  	int c=0;
   Scanner d=new Scanner(System.in);
   String s=d.nextLine();
   String a[]=s.split(" ");
   for(int i=0;i<a.length;i++)
   {
   	c++;
   }
   System.out.println(+c);
   
  }
}
