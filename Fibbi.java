import java.util.Scanner;

public class Fibbi {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number : ");
        int n=s.nextInt();
        s.close();
        int n1=0;
        int n2=1;
        int n3=0,i=2;
        System.out.println(n1);
        System.out.println(n2);
        while(i<n)
        {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
            i++;
        }
    }
    
}
