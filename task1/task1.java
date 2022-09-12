import java.util.Scanner;
class task1{
public static void main(String []args){
System.out.print("Enter rupee value:");
Scanner sc = new Scanner(System.in);
int a =sc.nextInt();
int output;
output=a*100;
System.out.print("The paise value is:"+output);
}
}