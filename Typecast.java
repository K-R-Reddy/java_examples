public class Typecast {

    public static void main(String[] args) {
    int a=256;
    double b=99.99;
    int c=(int)b;
    System.out.println("int value : "+a);
    System.out.println("double value : "+b);
    System.out.println("double to int : "+c);
    b=a;
    System.out.println("int to double : "+b);
    }
}