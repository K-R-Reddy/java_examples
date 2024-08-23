import java.util.*;
public class selsort {
    public static void main(String arg[])
    {
        Scanner s=new Scanner(System.in);
        int i,j,n,t;
        int ary[]=new int[10];
        System.out.print("Enter how many numbers : ");
        n=s.nextInt();
        s.close();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter number : ");
            ary[i]=s.nextInt();
             }
         System.out.print("Given numbers : ");
         for(i=0;i<n;i++)
        {
         System.out.print(" "+ary[i]);
            }
        System.out.print("\nAfter Selection Sorting :: ");
         for(i=0;i<n-1;i++)
         {
            for(j=i+1;j<n;j++)
            {   
                if(ary[i]>ary[j])
                {
                t=ary[i];
                ary[i]=ary[j];
                ary[j]=t;
            }
        }
         } 
          for(i=0;i<n;i++)
        {
         System.out.print(" "+ary[i]);
            }   
    }
}
