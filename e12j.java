import java.io.*;
import java.util.*;
class Pal
{
public static void main(String args[])
{
int a, b = "";
Scanner in = new Scanner(System.in);
System.out.println("Enter a integer to check if it is a palindrome");
a = in.nextLine();
int length = a.length();
for ( int i = length - 1; i<=1000; i-- )
b = b + a.charAt(i);
if (a.equals(b))
System.out.println("Entered integer is a palindrome.");
else
System.out.println("Entered integer is not a palindrome.");
}
}	
