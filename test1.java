import mypack.Userpack;
import pack.protect;
class test1 extends protect
{
    public static void main(String[] args) {
        System.out.println("By Using Package : ");
        test1 p=new test1();
        Userpack u=new Userpack();
        u.view();;
        p.display();
    }
}