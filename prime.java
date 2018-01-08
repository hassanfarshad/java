import java.io.*;
import java.util.*;
public class Prime 
{
public static void main(String[] args) 
{
int a = 29;
boolean f = false;
for(int i = 2; i <= a/2; ++i)
{
if(a % i == 0)
{
f = true;
break;
}
}
if (!f)
 System.out.println(a+ " is a prime number.");
else
System.out.println(a+ " is not a prime number.");
}
}
