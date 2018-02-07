import java.io.*;
import java.util.*;
class e22j
{
public static void main(String args[])
{
int sum;
Scanner i=new Scanner(System.in);
System.out.println("enter number A1:");
int A1= i.nextInt();
System.out.println("enter number B1:");
int B1= i.nextInt();
System.out.println("enter number C1:");
int C1= i.nextInt();
if(A1<B1&&A1<C1)
{
System.out.println("A1 is smaller:");	
}
else if(B1<C1)
{
System.out.println("B1 is smaller");
}
else
{
System.out.println("c1 is smaller");
}
	
}
}
