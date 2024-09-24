class a{
    void disp1(){
        System.out.println("Parent Class of B");
    }
    }
class b extends a{
    void disp2(){
        System.out.println("B is Child of A");
    }
}
public class multilevel extends b{
    void disp3(){
        System.out.println("MultiLevel is Child of B");
    }
    public static void main(String[] args) {
        multilevel o = new multilevel();
        o.disp1();
        o.disp2();
        o.disp3();
    }   
}
