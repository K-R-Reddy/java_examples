import java.util.Scanner;

public class MergeSort {
    public static void mergeSort(int[] a,int low,int high){
     if(low<high){
        int mid=(low+high)/2;
        mergeSort(a, low, mid);
        mergeSort(a, mid+1, high);
        merge(a,low,mid,high);
     }
    }
    public static void merge(int[] a,int low,int mid,int high){
        int[] b=new int[high+1];
        int i=low,k=low,j=mid+1;
        while(i<=mid && j<=high){
            if(a[i]<a[j]){
                b[k++]=a[i++];
            }
            else{
                b[k++]=a[j++];
            }
        }
        while(i<=mid){
            b[k++]=a[i++];
        }
        while (j<=high) {
            b[k++]=a[j++];
        }
        for(int l=low;l<=high;l++){
            a[l]=b[l];
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Array Size :: ");
        int n=s.nextInt();
        int[] a=new int[n];
        System.out.println("Enter "+n+" elements into array :: ");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        s.close();
        System.out.println("Given Array is :: ");
        for(int i:a){
            System.out.print(i+" ");
        }
        mergeSort(a,0,n-1);
        System.out.println("\nArray after using MergeSort :: ");
        for(int i:a){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
