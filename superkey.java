class par{
    par(){
        System.out.println("Parent Constructor");
    }
    void display(){
        System.out.println("This is a Parent Class");
    }
}
class superkey extends par{
    superkey(){
        super();
        System.out.println("Child Constructor");
    }
    void show(){
        super.display();
        System.out.println("This is a Child Class");
    }
    public static void main(String[] args) {
        superkey o = new superkey();
        o.show();
    }
}