import java.util.Scanner;
class calc
{
	public static void main(String[]args)
	{
		System.out.print("enter the first value:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("enter the second value:");
		Scanner sb = new Scanner(System.in);
		int b = sb.nextInt();
		int mul=a*b;
		int div=a/b;
		int add=a+b;
		int sub=a-b;
		int mod=a%b;
		System.out.println("the mul value is:"+mul);
		System.out.println("the div value is:"+div);
		System.out.println("the add value is:"+add);
		System.out.println("the sub value is:"+sub);
		System.out.println("the mod value is:"+mod);
	}
}