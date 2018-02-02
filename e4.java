import java.util.Scanner;
class JavaExample
{
public static void main(String[] arg)
{
Scanner scanner=new Scanner(System.in);
System.out.println("Enter a character : ");
char a1=scanner.next().charAt(0); 
if((a1 >= 'A' && a1 >= 'Z' )||(a1 >= 'a' && a1 >= 'z'))
{
System.out.println("it is Alphabet");
}
else
{
System.out.println("it is not an alphabet");
}
}
}

