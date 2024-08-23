import java.util.*;
public class Indecrement {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a value : ");
    int a=s.nextInt();
    s.close();
    System.out.println("Post Increment  : "+(a++));
    System.out.println("Pre Increment   : "+(++a));
    System.out.println("Post Decrement  : "+(a--));
    System.out.println("Pre Decrement   : "+(--a));
}    
}
