import java.util.*;
public class Bitwiseop {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a,b : ");
    int a=s.nextInt();
    int b=s.nextInt();
    s.close();
    System.out.println("Bitwise and : "+(a&b));
    System.out.println("Bitwise or : "+(a|b));
    System.out.println("Bitwise exor : "+(a^b));
    System.out.println("Complement : "+(~b));
    System.out.println("Left shift : "+(a<<2));
    System.out.println("Right shift : "+(b>>2));
}
}