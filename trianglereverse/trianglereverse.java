import java.util.Scanner;
class trianglereverse
{
public static void main(String args[])
{
System.out.println("enter the value:");
Scanner sb = new Scanner(System.in);
int term = sb.nextInt();
for(int i=1;i<=term;i++){
for(int j=term;j>=i;j--){
System.out.print("*");
}
System.out.println();
}
}
}