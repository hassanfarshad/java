import java.util.*;
class e108 
{
      public static void main(String args[])
      {
      int sum=0;
      int val;
      Scanner s=new Scanner(System.in);
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
      val=b;
      for(int i=0;i<a;i++)
      {
          sum=sum+val;
          val=val+c;
      }
       System.out.println(sum);
      }
}
