import java.io.*;
import java.util.Scanner;
class e19
{
public static void main(String args[])
{  
int i,f=1;  
Scanner d1=new Scanner(System.in);
System.out.println("Enter the values");
int a=d1.nextInt();
for(i=1;i<=a;i++)
{    
f=f*i;    
}    
System.out.println("Factorial of "+a+" is: "+f);    
}  
}  
