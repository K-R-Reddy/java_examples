import java.util.*;
public class Insertionsort {
    static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void Isort(int a[]){
        int n=a.length;
        for(int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
            a[j+1]=a[j];
            j=j-1;
            }
            a[j+1]=key;

    }
}
    public static void main(String args[]){
        int[] a;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter Array Size : ");
            int n=s.nextInt();
            a = new int[n];
            System.out.println("Enter "+n+" Elements into Array : ");
            for(int i=0;i<n;i++){
                a[i]=s.nextInt();
            }
        }
        System.out.println("Given Array : ");
        printArray(a);
        Isort(a);
        System.out.println("\nSorted Array : ");
        printArray(a);
        System.out.println();
    }
}
