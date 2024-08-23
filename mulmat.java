import java.util.*;
public class mulmat {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        System.out.println("Enter Numbers into Matrix A :: ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print("A["+i+"]["+j+"] = ");
                a[i][j]=m.nextInt();
            }
        }
        System.out.println("Enter Numbers into Matrix B :: ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print("B["+i+"]["+j+"] = ");
                b[i][j]=m.nextInt();
            }
        }
        m.close();
        System.out.println("After Multiplication of Two Matrixs :: ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {   
                c[i][j]=0;
                for(int k=0;k<a.length;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }

    }
    
}
