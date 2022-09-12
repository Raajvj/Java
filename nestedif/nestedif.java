import java.util.Scanner;
class nestedif
{
public static void main(String args[])
{
System.out.print("Enter your age:");
Scanner sb = new Scanner(System.in);
int age = sb.nextInt();
if(age>=18)
   {
   System.out.print("Enter your weight:");
   Scanner sc = new Scanner(System.in);
   int weight = sc.nextInt();
   if(weight>=50)
   {
   System.out.println("You're eligible");
   }
   else
   {
   System.out.println("Sorry! You're not eligible");
   }
}
else
{
System.out.println("Sorry! You're too young");
}
}
}   

