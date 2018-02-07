import java.io.*;
class pint 
{
public static void main(String[] args) 
{
int in1=20,in2=50;
while(in1<in2) 
{
boolean f=false;
for(int i=2;i<=in1/2;++i)
{
if(in1%i==0) 
{
f=true;
break;
}
}
if(!f)
System.out.print(in1+" ");
++in1;
}
}
}
