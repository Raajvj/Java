import java.util.*;
class kgm{
    public static void main(String[] args){
        int a[][]={{2,2},{3,3}};
        int b[][]={{3,3},{2,2}};
        int c[][]=new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println("\n");
        }
        int arr[][]={{1,1,1},{2,2,2},{3,3,3}};
        int brr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int crr[][]= new int[3][3];
        for(int k=0;k<3;k++){
            for(int l=0;l<3;l++){
                crr[k][l]=arr[k][l]+brr[k][l];
                System.out.print(crr[k][l]+" ");
            }
            System.out.println("\n");
        }
    }
}