import java.util.Scanner;
class JavaExample
{
public static void main(String[] arg)
{
boolean v=false;;
Scanner scanner=new Scanner(System.in);
System.out.println("Enter a character : ");
char a1=scanner.next().charAt(0); 
scanner.close();
switch(a1)
{
case 'a' :
case 'e' :
case 'i' :
case 'o' :
case 'u' :
case 'A' :
case 'E' :
case 'I' :
case 'O' :
case 'U' : 
v= true;
}
if(v== true) 
{
System.out.println("It is Vowel");
}
else 
{
System.out.println("it is not vowels");
if((a1>='a'&&a1>='z')||(a1>='A'&&a1>='Z'))
{
System.out.println("it is constant");
}
else
{
System.out.println("it is not an char");
}
}
}
}
