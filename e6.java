import java.util.Scanner;
class JavaExample
{
public static void main(String[] arg)
{
Scanner d1=new Scanner(System.in);
System.out.println("Enter the one YEAR : ");
int a=d1.nextInt(); 
if((a%4 == 0) && (a%100!=0))
{
System.out.print("This is a Leap Year");
}
else if(a%100 == 0)
{
System.out.print("This is not a Leap Year");
}
else if(a%400 == 0)
{
System.out.print("This is a Leap Year");
}
else
{
System.out.print("This is not a Leap Year");
}
}
}

