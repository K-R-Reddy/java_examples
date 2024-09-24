class par{
    void display(){
        System.out.println("This is a Parent Class");
    }
}
class inherit extends par{
    void show(){
        System.out.println("This is a Child Class");
    }
    public static void main(String[] args) {
        inherit o = new inherit();
        o.display();
        o.show();
    }
}