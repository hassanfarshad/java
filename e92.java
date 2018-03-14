import java.util.*;
class e92
{
     public static void main(String args[])
     {
     	int c=0;
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int[] b=new int[10];
        for(int i=0;i<a;i++)
        {
        	b[i]=s.nextInt();
        	c=c+b[i];
        }
        System.out.println(c);
    }
}
