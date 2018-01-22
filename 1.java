import java.io.*;
import java.util.Scanner;
public class ex1
{
public static void main(String[] args) 
{
int n;
Scanner s = new Scanner(System.in);
System.out.print("Enter the number:\n");
n = s.nextInt();
if(n > 0)
{
System.out.println("The given number is Positive");
}
else
{
System.out.println("The given number is Negative");
}
}
}
