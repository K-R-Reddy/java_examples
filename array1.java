import java.util.*;
public class array1
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter how many Elements in Array : ");
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
            System.out.println(j);
        }
    }
}