import java.util.*;
public class root {
    public static void main(String[] args) 
    {
    Scanner r = new Scanner(System.in);
    int a,b,c;
    double d,r1,r2;
    System.out.println("Ax^2 +Bx +C= 0");
    System.out.println("Enter A,B,C values : ");
    a=r.nextInt();
    b=r.nextInt();  
    c=r.nextInt();
    r.close();
    d=(b*b)-(4*a*c);
    r1=((-b)+(Math.sqrt(d)))/(2*a);
    r2=((-b)-(Math.sqrt(d)))/(2*a);
    if(d>0)
    {
       System.out.println("Roots are real and distinct"); 
    }
    else if(d==0)
    {
        System.out.println("Roots are real and equal");
    }
    else 
    {
        System.out.println("Roots are imaginary");
    }
    System.out.println("Roots of ("+a+")x^2 +("+b+")x +("+c+")= 0 is "+r1+" and "+r2);

}
    
}
