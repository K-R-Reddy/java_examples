import java.util.*;
public class Ternary {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a,b : ");
        int a=s.nextInt();
        int b=s.nextInt();
        s.close();
        int max=(a>b)?a:b;
        System.out.println("Large value is "+max);
    }
}