import java.io.*;
public class pint 
{
public static void main(String[] args) 
{
int a=20,b=50;
while(a<b) 
{
boolean f=false;
for(int i=2;i<=a/2;++i)
{
if(a%i==0) 
{
f=true;
break;
}
}
if(!f)
System.out.print(a+" ");
++a;
}
}
}
