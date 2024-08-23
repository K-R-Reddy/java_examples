import java.util.*;
public class tables {
    public static void main(String args[])
    {
        Scanner m=new Scanner(System.in);
        int a,i,mul=0;
        System.out.println("Enter table number : ");
        a=m.nextInt();
        m.close();
        for(i=1;i<21;i++)
        {
            mul=a*i;
            System.out.println(a+" * "+i+" = "+mul);
        }
    }
}
