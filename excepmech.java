import java.util.*;
public class excepmech{
    public static void main(String[] args) {
        try{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
            int arr[]=new int[20];
            int a= s.nextInt();
            int b = s.nextInt();
            System.out.println("Division : " + a/b);
            arr[a]=b;
            System.out.println(arr[a]);
            s.close();
        } 
        catch (Exception e) {
            System.out.println("Error: Invalid input.");
            System.out.println(e);} 
    }
}

    
