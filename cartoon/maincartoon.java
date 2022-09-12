class cartoon{
String character;
String channel;
double time;
void showtime(double t,String c){
double time=t;
String character=c;
System.out.println("show time:"+t+" "+"show name:"+c);
}
void showcartoon(String ch){
String channel=ch;
System.out.println("the cartoon details are:"+ch);
}
}
class maincartoon{
public static void main(String args[])
{
cartoon obj=new cartoon();
obj.showtime(8.35d,"tom and jerry");
obj.showcartoon("cartoon network");
cartoon obj2=new cartoon();
obj.showtime(9.35d,"dragon booster");
obj.showcartoon("jetix");
}
}
