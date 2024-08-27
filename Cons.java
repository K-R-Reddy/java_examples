public class Cons {
    Cons(){
        System.out.println("Constructor called");
    }
    void display()
    {
        System.out.println("Constructor class");
    }
    public static void main(String[] args) {
        Cons c = new Cons();
        c.display();
}
}
