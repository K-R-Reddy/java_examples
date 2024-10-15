public class Multicatch {
    public static void main(String[] args) {
        try {
            int a[]=new int[5];
            a[0]=10;
            a[4]=8;
            System.out.println(a[5]);
        } 
        catch (ArithmeticException ae) {
            System.out.println("Divide by zero");
        }
        catch(NullPointerException npe){
            System.out.println(npe);
        }
        catch(ArrayIndexOutOfBoundsException aioobe){
            System.out.println("Array index out of range");
        }
    }
    
}
