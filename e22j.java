import java.io.*;
import java.util.*;
class e22j
{
public static void main(String args[])
{
int sum;
Scanner i=new Scanner(System.in);
System.out.println("enter number A:");
int A= i.nextInt();
System.out.println("enter number B:");
int B= i.nextInt();
System.out.println("enter number C:");
int C= i.nextInt();
if(A>B&&A>C)
{
System.out.println("A is greater:");	
}
else if(B>C)
{
System.out.println("B is greater");
}
else
{
System.out.println("c is greater");
}
	
}
}
