public class metover {
    void add(int a,int b)
    {
        System.out.println("Two Variable Integer Addition : "+(a+b));
    }
    void add(double a,double b)
    {
        System.out.println("Two Variable Double Addition : "+(a+b));
    }
    void add(int a,int b,int c)
    {
        System.out.println("Three Variable Integer Addition : "+(a+b+c));
    }
    void add(double a,double b,double c)
    {
        System.out.println("Three Variable Double Addition : "+(a+b+c));
    }
    public static void main(String[] args) {
        metover m=new metover();
        m.add(10, 20);
        m.add(10.5, 20.5);
        m.add(10, 20, 30);
        m.add(10.5, 20.5, 30.5);
    } 
}
