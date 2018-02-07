import java.io.*;
class amb
{
public static void main(String[] args)
{
int a1=1,b1=1000;
for(int i=a1+1;i<=b1;++i)
{
int n=0;
int d=0;
int or=i;
while (or != 0) 
{
or /= 10;
++n;
}
or=i;
while (or != 0) 
{
int r = or % 10;
d += Math.pow(r,n);
or/= 10;
}
if (d == i)
System.out.print(i + " ");
}
}
}
