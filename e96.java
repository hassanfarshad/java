import java.util.Scanner;
import java.util.ArrayList;
class e96
{
  public static void main(String args[])
  {
  int c=0;
  Scanner d=new Scanner(System.in);
  int s=d.nextInt();
  for(int i=2;i<s;i++)
  {
  if(s%i==0)
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
