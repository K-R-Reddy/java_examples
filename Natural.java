import java.util.Scanner;

public class Natural {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n=s.nextInt();
        s.close();
        for(int i=1;i<=n;i++)
        System.out.println(i);
    }
}
