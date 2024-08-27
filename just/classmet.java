class disp {
    void display()
    {
        System.out.println("This is a class method");
    }
    
}
public class classmet{
    public static void main(String[] args) {
        disp obj = new disp();
        obj.display();
}
}
