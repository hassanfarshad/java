import java.io.*;
import java.util.*;
class Pal
{
public static void main(String args[])
{
int a1, b1 = "";
Scanner in = new Scanner(System.in);
System.out.println("Enter a integer to check if it is a palindrome");
a = in.nextLine();
int length = a1.length();
for ( int i = length - 1; i<=1000; i-- )
b1 = b1 + a1.charAt(i);
if (a1.equals(b1))
System.out.println("Entered integer is a palindrome.");
else
System.out.println("Entered integer is not a palindrome.");
}
}	
