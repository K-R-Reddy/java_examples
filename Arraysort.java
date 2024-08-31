import java.util.*;
public class Arraysort {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter how any Elements in Array : ");
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter Element : ");
            a[i]=s.nextInt();
        }
        s.close();
        System.out.println("Before Sorting Array is : ");
        for (int j : a) {
            System.out.print(j+" ");
        }
        Arrays.sort(a);
        System.out.println("\nAfter Sorting Array is : ");
        for (int j : a) {
            System.out.print(j+" ");
        }

    }

    
}
