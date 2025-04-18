import java.util.Scanner;

public class mergetwo {
public static void main(String args[]){
    int a[]=new int[4];
    int b[]=new int[3];
    int c[]=new int [10];
    int m=4,n=3,i,j,k;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elemnts for a:");
    for(i=0;i<m;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("Enter elemnts for b:");
    for(j=0;j<n;j++){
        b[j]=sc.nextInt();
    }
    i=0;j=0;k=0;
    while(i<m && j<n){
        if(a[i]<b[j]){
            c[k]=a[i];
            i++;
            k++;
        }
        else{
            c[k] = b[j];
            j++;
            k++;
        }
    }
    while(i<m){
        c[k] = a[i];
        i++;
        k++;
    }
    while(j<n){
        c[k]=b[j];
        j++;
        k++;
    }
    for(i=0;i<k;i++){
        System.out.println("Sorted array is:" + c[i]);
    }

}
}
