import java.util.Scanner;
class ifelse
{
public static void main(String [] args)
{
System.out.print("check the num whether it is odd or even:");
Scanner sb = new Scanner(System.in);
int num = sb.nextInt();
if(num%2==0)
{
System.out.print("the num is even");
}
else
{
System.out.print("the num is odd");
}
}
}