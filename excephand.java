public class excephand{
    public static void main(String args[]){
        try{
            int a=0,b=10;
           System.out.println("Exception Handling");
           System.out.println(b/a);
           System.out.println("After Exception");
        }
        catch(Exception e){
            System.out.println("Divide by zero");
        }
     
         
    }
}