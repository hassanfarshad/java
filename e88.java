import java.util.*;
class e88
{
     public static void main(String args[])
     {
        int g=0;
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        for(int i=1;i<=a&&i<=b;i++)
        {
            if(a%i==0&&b%i==0)
            {
               g=i;
            }
        }
        int l=(a*b)/g;
        System.out.println(l);
    }
}
