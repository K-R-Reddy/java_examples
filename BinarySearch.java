import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter how many Elements in Array : ");
    int n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        System.out.print("Enter Element : ");
        a[i]=s.nextInt();
    }
    int temp=0;
    for(int i=0;i<n-1;i++)
    {
        for(int j=i+1;j<n;j++)
        {  
            if(a[i]>a[j])
            {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            }
         }
        
    }
    for(int k:a)
    {
    System.out.print(k+" ");
    }
    System.out.println();
    System.out.println("Enter Element to Search in Array : ");
    int ele=s.nextInt();
    s.close();
    int start=0;
    int end=n-1;
    int mid=0;
    while(start<=end)
    {
        mid=start+(end-start)/2;
        if(a[mid]==ele)
        {
            System.out.println(ele+" is Found at Index "+mid+" and Position : "+(mid+1));
            break;
        }
        else if(a[mid]>ele)
        {
            end=mid-1;
        }
        else
        {
            start=mid+1;
        }
    }
  }
}
