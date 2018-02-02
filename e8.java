import java.util.Scanner;
class JavaExample
{
public static void main(String[] arg)
{
int sum=0;
Scanner d1=new Scanner(System.in);
System.out.println("Enter the one YEAR : ");
int a=d1.nextInt(); 
for(int i=0;i<=a;i++)
{
sum = sum+i;	
}
System.out.println("sum of natural number is:"+sum);
}
}

