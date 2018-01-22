import java.io.*;
import java.util.Scanner;
public class ex2
{
public static void main(String[] args)
{
int n;
Scanner s = new Scanner(System.in);
System.out.print("Enter the number:\n");
n = s.nextInt();
  if(n%2==0)
  {
    System.out.println("the given number is even");
  }
  else
    {
    System.out.println("the given number is odd");
  }
}
}
