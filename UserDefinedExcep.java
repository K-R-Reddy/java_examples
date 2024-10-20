import java.util.*;
public class UserDefinedExcep {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter Your Age: ");
            int age = s.nextInt();
            if (age < 18) {
                throw new Exception("You are a minor and unable to vote.");
            } else {
                System.out.println("You have the right to vote.");
            }
        } catch (Exception e) {
            System.out.println(e);
        }  finally {
            s.close();
        }
    }
}

