import java.util.*;
class e71
{
     public static void main(String args[])
     {
     Scanner s=new Scanner(System.in);
     String a=s.nextLine();
     String b = new StringBuffer(a).reverse().toString();
     if(a.equals(b))
     {
     System.out.println("PALINDROME");
     }
     else
     {
     System.out.println("NOT A PALINDROME");	
     }
     }
}
