public class ConstOver {

    public ConstOver() {
        System.out.println("Default Constructor");
    }
    public ConstOver(int i) {
        System.out.println("Parameterized Constructor");
        System.out.println("i value : "+i);
    }
    void display()
    {
        System.out.println("Constructor Overloading");
    }
     public static void main(String[] args) {
         ConstOver obj1 = new ConstOver();
         ConstOver obj2 = new ConstOver(10);
         obj1.display();
         obj2.display();
     }
}
