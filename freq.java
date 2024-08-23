import java.util.*;
public class freq {
    public static void main(String[] args) {
    Scanner f = new Scanner(System.in);
    int ary[]=new int[15];
    int a;
    System.out.println("Enter how many numbers : ");
    a=f.nextInt();
    int c[]=new int[a];
    for(int i=0;i<a;i++)
    {
        System.out.print("Enter number : ");
        ary[i]=f.nextInt();
    }
    f.close();
    System.out.println("Given numbers :");
    for(int i=0;i<a;i++)
    {
        System.out.print(ary[i]+" ");
    }
    System.out.println("\nFrequency of numbers :: ");
    for(int i=0;i<a;i++)
    {
       int count=1;
        for(int j=i+1;j<a;j++)
        {
            if(ary[i]==ary[j])
            {
                count++;
                c[j]=-1;
            }
        }
        if(c[i]!=-1)
        {
            System.out.println(ary[i]+" - "+count);
        }
        }
    }
 }
    
