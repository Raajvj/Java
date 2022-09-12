class content{
    void data(){
        System.out.println("welcom");
    }
}
class detail extends content{
    void data(){
        System.out.println("Hello");
    }
}
class kgm{
    public static void main(String[] args){
        detail obj=new detail();
        obj.data();
    }
}