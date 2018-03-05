import java.util.Scanner;
import java.util.ArrayList;
class Red 
{
  public static void main(String args[])
  {
   Scanner d=new Scanner(System.in);
  String a=d.nextLine();
  int b=d.nextInt();
  char e[]=a.toCharArray();
  for(int i=0;i<b;i++)
  {
    System.out.printf("%c",e[i]);
  }
  }
}
