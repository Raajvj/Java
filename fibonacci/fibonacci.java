import java.util.*;

class fibonacci {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.println("Enter the num:");
        int a = sb.nextInt();
        System.out.println("The fibonacci is:");
        int n1 = 1, n2 = 1, n3;
        System.out.print(n1 + " ");
        for (int i = 1; i < a; i++) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
        }
    }
}