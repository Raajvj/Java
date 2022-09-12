import java.util.Scanner;
class SwapWithUser
{
public static void main(String [] args)
{
System.out.print("enter value of a:");
Scanner sb = new Scanner(System.in);
int a = sb.nextInt();
System.out.print("enter value of a:");
Scanner sc = new Scanner(System.in);
int b = sc.nextInt();
int c = a+b;
int d = c-a;
int e = c-b;
System.out.println("swap value of a:"+d);
System.out.println("swap value of b:"+e);
}
}