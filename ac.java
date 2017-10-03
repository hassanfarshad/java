import java.io.*;
public class Palindrome 
{
public static void main(String[] args) 
{
int num = 121, re= 0, rem, o;
o = num;
while( num != 0 )
{
remainder = num % 10;
rer = re * 10 + rem;
num  /= 10;
}
if (o == re)
System.out.println(o+ " is a palindrome.");
else
System.out.println(o + " is not a palindrome.");
}
}
