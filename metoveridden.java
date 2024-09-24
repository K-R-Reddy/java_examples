class bike{
    void type(){
        System.out.println("Two Wheeler Vehicle");
    }
}
class car extends bike{
    void type(){
        System.out.println("Four Wheeler Vehicle");
    }
}
public class metoveridden {
    public static void main(String[] args) {
        System.out.println("Method Overriding");
        bike b=new bike();
        car c=new car();
        b.type();
        c.type();
    }
}
