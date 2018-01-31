import java.io.*;
import java.util.*;
class e22
{
public static void main(String args[])
{
Scanner i=new Scanner(System.in);
System.out.println("enter number a:");
int a= i.nextInt();
System.out.println("enter number b:");
int b= i.nextInt();
System.out.println("enter number c:");
int c= i.nextInt();
if(a<b&&a<c)
{
System.out.println("A is Smaller:");	
}
else if(b<c)
{
System.out.println("B is Smaller");
}
else
{
System.out.println("c is Smaller");
}
}
}
