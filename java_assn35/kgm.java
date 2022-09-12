class kgm{
    public static void main(String[] args){
    int n1=1,n2=1,n3,total=10;
    System.out.print(n1+" ");
    for(int i=1;i<total;i++){
        n3=n1+n2;
        n1=n2;
        n2=n3;
        System.out.print(n3+" ");
    }
}
}