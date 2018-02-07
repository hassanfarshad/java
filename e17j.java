import java.io.*;
class Ar
{  
public static void main(String[] args)
{  
int a1=0,b1,c1;  
int n=153;  
c1=n;  
while(n>0)  
{  
b1=n%10;  
n=n/10;  
a1=a1+(b1*b1*b1);  
}  
if(c1==a1)  
System.out.println("armstrong number");   
else  
System.out.println("Not armstrong number");   
}  
}
