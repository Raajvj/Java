class kgm{
    public static void main(String[] args){
        int a[]={5,7,2,4,9},temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
            if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
            
        }
            
         
    }
            int abc=a[0];
            int b=a[a.length-1];
            int c= b-abc;
       
            System.out.println(c);
}
}