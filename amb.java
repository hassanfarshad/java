import java.io.*;
public class amb
{
public static void main(string[] args)
{
int a=150,b=160,c,n=0;
while(a<b)
{
for(int i=1;i<=a;++i)
{
  while(n>0)  
{  
b=n%10;  
n=n/10;  
a=a+(b*b*b);  
}  
}
  system.out.println(a+"");
}
}
