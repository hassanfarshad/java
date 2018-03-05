import java.util.Scanner;
import java.util.ArrayList;
class Red 
{
  public static void main(String args[])
  {
  	int c=0;
   Scanner d=new Scanner(System.in);
   int s=d.nextInt();
   int p=d.nextInt();
   c=s+p;
   if(c%2==0)
   {
   System.out.println("EVEN");	
   }
   else
   {
   System.out.println("ODD");
   }
  }
}
