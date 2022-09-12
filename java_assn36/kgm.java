abstract class Student{
    abstract void details();
    abstract void marks();
}
class studentdetail extends Student{
    void details(){
        int id =1001;
        String name="Arun.M";
        System.out.println("StudentID:"+id);
        System.out.println("Student Name:"+name);
    }
    void marks(){
        int m1=95;
        int m2=95;
        int m3=98;
        int tot=m1+m2+m3;
        int avg=tot/3;
        System.out.println("m1="+m1);
        System.out.println("m2="+m2);
        System.out.println("m3="+m3);
        System.out.println("Total="+tot);
        System.out.println("Percenatge="+avg);
        if(avg>60){
            System.out.println("Grade=O");
        }
        
    }
}
class kgm{
    public static void main(String [] args){
        Student obj=new studentdetail();
        obj.details();
        obj.marks();
    }
}