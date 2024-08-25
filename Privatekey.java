class Private1{
    private String key="Reddy";
    public void getKey(){
        System.out.println("Key is "+key);
    }
}
public class Privatekey {

    public static void main(String[] args) {
        Private1 p1=new Private1();
        p1.getKey();
    }
}