import java.util.*;
class jagary
{
    public static void main(String[] args) {
        Scanner ja=new Scanner(System.in);
        int ary[][] = new int[3][];
        int x,y,z;
        System.out.print("Enter How many cols in row1 : ");
        x=ja.nextInt();
        ary[0]=new int[x];
        System.out.print("Enter How many cols in row2 : ");
        y=ja.nextInt();
        ary[1]=new int[y];
        System.out.print("Enter How many cols in row3 : ");
        z=ja.nextInt();
        ary[2]=new int[z];
        for(int i=0;i<ary.length;i++)
        {
            for(int j=0;j<ary[i].length;j++)
            {
                System.out.print("Enter number into row"+(i+1)+" : ");
                ary[i][j]=ja.nextInt();
            }
        }
        ja.close();
        System.out.println("Jagged Array is : ");
          for(int i=0;i<ary.length;i++)
        {
            for(int j=0;j<ary[i].length;j++)
            {
                System.out.print(" "+ary[i][j]);
            }
            System.out.println();
        }
    }
}