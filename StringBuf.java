/**
 * StringBuf
 */
public class StringBuf {

    public static void main(String[] args) {
        StringBuffer s=new StringBuffer("Karri Rajeswara Reddy");
        System.out.println("Original String : "+s);
        s.delete(14, 21);
        System.out.println("After Deletion : "+s);
        s.delete(0, s.indexOf("R"));
        System.out.println("After Removal : "+s);
}
}