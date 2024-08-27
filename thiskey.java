public class thiskey {
    int a=10;
    void display(int a)
    {
        a=50;//here local variable is always 50
        System.out.println("local variable : "+a);
        System.out.println("Instance variable : "+this.a);
    }
    public static void main(String[] args) {
        thiskey obj=new thiskey();
        obj.display(100);
    }
    
}
