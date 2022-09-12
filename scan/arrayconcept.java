import java.util.*;
class arrayconcept{
public static void main(String[] args){
Scanner sb = new Scanner(System.in);
System.out.println("length");
int  a = sb.nextInt();
int[] arr=new int[a];

System.out.println("the values are:");
for(int i=0;i<a;i++){
arr[i]=sb.nextInt();
} 
System.out.println("array");
for(int i=0;i<a;i++){
if(arr[i]==3){

System.out.println(i);
}
}
}
}
