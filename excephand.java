public class excephand{
    @SuppressWarnings("null")
    public static void main(String args[]){
        try{
            String s=null;
           System.out.println("Exception Handling");
           System.out.println(s.length());
           System.out.println("After Exception");
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
     
         
    }
}