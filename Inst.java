class Dot
{
    void display()
    {
        System.out.println("This Class is Created for Dot Operator");
    }
}
public class Inst {
    public static void main(String[] args) {
        Inst obj =new Inst();
        Dot d=new Dot();
        d.display();
        System.out.println(obj instanceof Inst);
    }
    
}
