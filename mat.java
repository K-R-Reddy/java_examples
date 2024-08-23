import java.util.*;
public class mat
{
public static void main(String[] args)
{
int[][] a=new int[10][10];
int[][] b=new int[10][10];
int[][] c=new int[10][10]; 
int i,j,k,r1,r2,c1,c2;
Scanner si=new Scanner(System.in);
System.out.println("enter number of rows:");
r1=si.nextInt();
System.out.println("enter number of cols:");
c1=si.nextInt();
System.out.println("enter number of rows:");
r2=si.nextInt();
System.out.println("enter number of cols:");
c2=si.nextInt();
for(i=0;i<r1;i++)
{
for(j=0;j<c1;j++)
{
System.out.println("enter element:");
a[i][j]=si.nextInt();
}
}
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
System.out.println("enter element:");
b[i][j]=si.nextInt();
}
}
for(i=0;i<r2;i++)
{
for(j=0;j<c2;j++)
{
for(k=0;k<c1;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
}
}
for(i=0;i<r1;i++)
{
for(j=0;j<c2;j++)
{
System.out.print(c[i][j]);
}
System.out.println();
}
}
}