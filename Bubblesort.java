import java.util.Scanner;

public class Bubblesort {
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
        System.out.println("Given Array is : ");
        for (int j : a) {
            System.out.print(j+" ");
        }
        int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int k=0;k<n-i-1;k++)
            {
                if(a[k]>a[k+1])
                {
                    temp=a[k];
                    a[k]=a[k+1];
                    a[k+1]=temp;
                }

            }
        }
        System.out.println("\nSorted Array : ");
        for (int j : a) {
            System.out.print(j+" ");
        }
 }    
}