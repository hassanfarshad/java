import java.io.*;
public class amb
{
public static void main(String[] args)
{
int a=0,b=0;
int n=153;
for(int i=0;i<=160;++i)
while(n>=0)  
{  
b=n%10;  
n=n/10;  
a=a+(b*b*b); 
 System.out.println(a);
}  
}
}
