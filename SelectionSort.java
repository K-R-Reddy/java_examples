import java.util.*;
public class SelectionSort{
    static void printArray(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    static void Ssort(int a[]){
        int t,min;
    for(int i=0;i<a.length-1;i++)
    {
        min=i;
        for(int j=i+1;j<a.length;j++){
            if(a[i]>a[j]){
            min=j;
            }
        }
        t=a[i];
        a[i]=a[min];
        a[min]=t;
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
        System.out.println();
        Ssort(a);
        System.out.println("Sorted Array : ");
        printArray(a);
        System.out.println();
    }
}