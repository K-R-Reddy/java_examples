import java.util.*;/**
 * relational
 */
public class relational {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a,b values : ");
        int a=s.nextInt();
        int b=s.nextInt();
        s.close();
        System.out.println(a+" > "+b+" : "+(a>b));
        System.out.println(a+" < "+b+" : "+(a<b));
        System.out.println(a+" = "+b+" : "+(a==b));
        System.out.println(a+" != "+b+" : "+(a!=b));
        System.out.println(a+" >= "+b+" : "+(a>=b));
        System.out.println(a+" <= "+b+" : "+(a<=b));
    }

    
}