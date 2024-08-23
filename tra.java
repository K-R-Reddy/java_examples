import java.util.*;
public class tra {
 public static void main(String args[])
 {
    int[][] ary=new int[10][10];
    int i,j,m,n;
    Scanner si=new Scanner(System.in);
    System.out.println("Enter how many rows and cols :: ");
    m=si.nextInt();
    n=si.nextInt();
    for(i=0;i<m;i++)
    {
    for(j=0;j<n;j++)
    {
    System.out.println("Enter number : ");
    ary[i][j]=si.nextInt();
    }
   }
   si.close();
   System.out.println("Given Matrix is :: ");
   for(i=0;i<m;i++)
   {
    for(j=0;j<n;j++)
    {
        System.out.print(" "+ary[i][j]);
    }
    System.out.println();
   }
   System.out.println("After Tranposing :: ");
   for(i=0;i<m;i++)
   {
    for(j=0;j<n;j++)
    {
        System.out.print(" "+ary[j][i]);
    }
    System.out.println();
   }
 }   
}
