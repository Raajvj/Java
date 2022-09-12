import java.util.Scanner;
class ifstatement
{
public static void main(String args[])
{
System.out.println("check your eligibility:");
System.out.println("enter the age:");
Scanner sb = new Scanner(System.in);
int age = sb.nextInt();
if(age<18)
{
System.out.println("you're not elgible");
}
else
{
System.out.println("you're eligible");
}
}
}