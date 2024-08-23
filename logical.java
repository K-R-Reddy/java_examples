import java.util.*;
public class logical {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a,b,c values : ");
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    s.close();
    System.out.println(a+" != "+b+" and "+b+" = "+c+" : "+((a!=b)&&(b==c)));
    System.out.println(a+" != "+b+" or "+b+" = "+c+" : "+((a!=b)||(b==c)));
    System.out.println("Not "+b+" = "+c+" : "+(!(b==c)));
}    
}
