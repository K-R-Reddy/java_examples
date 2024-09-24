import java.util.*;
abstract class area{
    void circle(int r){
       System.out.println("Area of Circle : "+((22*r*r)/7));
    } 
    void square(int s){
    System.out.println("Area of Square : "+(s*s));
    }
    abstract void triangle(int b,int h);
    abstract void rectangle(int len,int bre);   
}
public class abstractkey extends area {

    void triangle(int b,int h){
        System.out.println("Area of the Triangle : "+0.5*b*h);
    }
    void rectangle(int len,int bre){
        
        System.out.println("Area of the Rectangle : "+len*bre);

    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    abstractkey o=new abstractkey();
     System.out.println("Enter radius of the Circle : ");
     int radius=sc.nextInt();
     o.circle(radius);
     System.out.println("Enter side of the Square : ");
     int side=sc.nextInt();
     o.square(side);
     System.out.println("Enter Base of the Triangle : ");
     int base=sc.nextInt();
     System.out.println("Enter Height of the Triangle : ");
     int hei=sc.nextInt();
     o.triangle(base,hei);
     System.out.println("Enter Length of the Rectangle : ");
        int length=sc.nextInt();
        System.out.println("Enter Breadth of the Rectangle : ");
        int breadth=sc.nextInt();
     sc.close();
     o.rectangle(length,breadth);
    }
    
}
