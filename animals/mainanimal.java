import java.util.*;
abstract class animals{
abstract void fly();
abstract void eat();
abstract void size();
}


class bird extends animals{
void fly(){
String name="eagle";
int id=1;
System.out.println(name+" "+id);
}


void eat(){
System.out.println("Eagle eats reptiles");
}

void size(){
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
Scanner sb = new Scanner(System.in);
int b = sb.nextInt();
int c = a+b;
System.out.println("Eagle size is:"+c);
}
}

class mainanimal{
public static void main(String args[]){
animals obj=new bird();
obj.fly();
obj.eat();
obj.size();
}
}


